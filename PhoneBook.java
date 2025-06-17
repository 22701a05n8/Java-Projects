import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private static HashMap<String, String> phonebook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- PhoneBook Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting PhoneBook...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        phonebook.put(name, phone);
        System.out.println("Contact added successfully.");
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            System.out.println("Phone number for " + name + ": " + phonebook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayContacts() {
        if (phonebook.isEmpty()) {
            System.out.println("PhoneBook is empty.");
        } else {
            System.out.println("--- All Contacts ---");
            for (String name : phonebook.keySet()) {
                System.out.println("Name: " + name + ", Phone: " + phonebook.get(name));
            }
        }
    }
}
