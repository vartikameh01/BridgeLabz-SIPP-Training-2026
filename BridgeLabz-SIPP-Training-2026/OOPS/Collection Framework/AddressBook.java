import java.util.*;

class AddressBook {

    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();
        HashMap<String, String> phoneBook = new HashMap<>();
        HashMap<String, String> emailBook = new HashMap<>();
        HashSet<String> phones = new HashSet<>();
        if (phones.add("9876543210")) {
            contacts.add("Rahul");
            phoneBook.put("Rahul", "9876543210");
            emailBook.put("Rahul", "rahul@gmail.com");
        }

        if (phones.add("9876543211")) {
            contacts.add("Aman");
            phoneBook.put("Aman", "9876543211");
            emailBook.put("Aman", "aman@gmail.com");
        }

        System.out.println("Rahul Phone : " + phoneBook.get("Rahul"));

        contacts.remove("Aman");
        phoneBook.remove("Aman");
        emailBook.remove("Aman");

        Collections.sort(contacts);

        System.out.println("\nContacts");
        for (String name : contacts) {
            System.out.println(name + " " + phoneBook.get(name) + " " + emailBook.get(name));
        }
    }
}