import enums.Gender;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalArgumentException{
        Owner owner = new Owner("Jay","Snicks", "+381222", Gender.male);
        String contact= owner.getContactNumber();
        System.out.println(contact);
    }
}