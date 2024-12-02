public class Main {
    public static void main(String[] args) {
        // Create a new contact
        Contact contact = new Contact(
                "John", "Doe", "123 Elm Street", "Springfield",
                "Illinois", "62704", "123-456-7890", "john.doe@example.com"
        );

        System.out.println(contact);
    }
}
