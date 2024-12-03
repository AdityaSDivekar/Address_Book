import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully: " + contact.getFirstName() + " " + contact.getLastName());
    }

    public boolean editContact(String firstName, String lastName, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().trim().equalsIgnoreCase(firstName.trim()) &&
                    contact.getLastName().trim().equalsIgnoreCase(lastName.trim())) {
                contacts.set(i, updatedContact);
                System.out.println("Contact updated successfully.");
                return true;
            }
        }
        System.out.println("Contact not found.");
        return false;
    }

    public boolean deleteContact(String firstName, String lastName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            // Match the contact using case-insensitive and trimmed names
            if (contact.getFirstName().trim().equalsIgnoreCase(firstName.trim()) &&
                    contact.getLastName().trim().equalsIgnoreCase(lastName.trim())) {
                contacts.remove(i); // Remove the contact
                System.out.println("Contact deleted successfully: " + firstName + " " + lastName);
                return true;
            }
        }
        System.out.println("Contact not found. Please check the name and try again.");
        return false;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the Address Book.");
        } else {
            System.out.println("Contacts in the Address Book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
