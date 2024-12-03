import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to the Address Book Program!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    // Get contact details from user
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine().trim();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine().trim();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine().trim();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine().trim()
                            ;
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine().trim();
                    System.out.print("Enter Zip Code: ");
                    String zip = scanner.nextLine().trim();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine().trim();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine().trim();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

                    addressBook.addContact(newContact);
                }
                case 2 -> {
                    addressBook.displayContacts();
                }
                case 3 -> {
                    System.out.print("Enter First Name of the contact to edit: ");
                    String firstName = scanner.nextLine().trim();
                    System.out.print("Enter Last Name of the contact to edit: ");
                    String lastName = scanner.nextLine().trim();

                    System.out.println("Enter new details for the contact:");
                    System.out.print("Enter First Name: ");
                    String newFirstName = scanner.nextLine().trim();
                    System.out.print("Enter Last Name: ");
                    String newLastName = scanner.nextLine().trim();
                    System.out.print("Enter Address: ");
                    String newAddress = scanner.nextLine().trim();
                    System.out.print("Enter City: ");
                    String newCity = scanner.nextLine().trim();
                    System.out.print("Enter State: ");
                    String newState = scanner.nextLine().trim();
                    System.out.print("Enter Zip Code: ");
                    String newZip = scanner.nextLine().trim();
                    System.out.print("Enter Phone Number: ");
                    String newPhoneNumber = scanner.nextLine().trim();
                    System.out.print("Enter Email: ");
                    String newEmail = scanner.nextLine().trim();

                    Contact updatedContact = new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);

                    addressBook.editContact(firstName, lastName, updatedContact);
                }

                case 4 -> {
                    // Delete Contact
                    System.out.print("Enter First Name of the contact to delete: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name of the contact to delete: ");
                    String lastName = scanner.nextLine();

                    addressBook.deleteContact(firstName, lastName);
                }
                case 5-> {
                    System.out.println("Exiting Address Book Program. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
