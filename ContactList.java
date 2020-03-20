package Java2_03;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<String> ContactList = new ArrayList<>();
    private ArrayList<String> ContactList1 = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void displayList(){
        for(int i = 0;i<ContactList.size();i++){
            System.out.println((i+1) + "." + ContactList.get(i) + " -> " + ContactList1.get(i));
        }
    }

    public void addName(String name){
             ContactList.add(name);
    }
    public void addNumber(String number){
         ContactList1.add(number);
    }

    public void updateName(int index, String name1){
        ContactList.set(index, name1);
    }
    public void updateNumber(int index, String number1){
        ContactList1.set(index, number1);
    }

    public String findContact(String name){
        int index = ContactList.indexOf(name) ;
        if(index > 0){
            ContactList1.get(index) ;
        }
        return ContactList1.get(index) ;
    }


    public static void main (String [] args){
        ContactList list = new ContactList();
        int n;
        String number;
        String name;
        String name1;
        System.out.println("0 - to shotdown" +
                "\n 1 - to print contacts" +
                "\n 2 - to add a new contact" +
                "\n 3 - to update existing contact" +
                "\n 4 - to remove an existing contact " +
                "\n 5 - query if an existing contact exists" +
                "\n 6 - to print a list of available actions ." +
                "\n Choose your action : ");

        do{
            do{
                System.out.println(" ");
                System.out.print("Enter action : (6 to show available actions) ");
                n = scanner.nextInt();

            }while (n < 0 || n > 6);
            switch (n){
                case 1 :
                    System.out.println("Contact List");
                    list.displayList();
                    break;

                case 2 :
                    System.out.println("Enter new contact name :");
                    list.addName(name = scanner.next());
                    System.out.println("Enter phone number :");
                    list.addNumber(number = scanner.next());
                    System.out.println("New contact added : name = " + name + " , " + "phone = " + number );
                     break;

                case 3 :
                    System.out.println("Enter existing contact name : ");
                    list.addName(name = scanner.next());
                    System.out.print("Enter new contact name : ");
                    list.updateName( scanner.nextInt(),name1 = scanner.next());
                    System.out.print("Enter phone number : ");
                    list.updateNumber(scanner.nextInt(),scanner.next());
                    System.out.println(name + "," + "was replaced with " + name1);
                    System.out.print("Successfully updated record");
                    break;

                case 4 :
                    System.out.print("Enter existing contact name : ");
                    list.ContactList.remove(name = scanner.next() );
                    System.out.println(name + "," + " was deleted.");
                    System.out.println( "Successfully deleted");
                    break;

                case 5 :
                    System.out.print("Enter existing contact name : ");
                    name = scanner.next();
                    System.out.print("Name : " + name + " phone number is : " + list.findContact(name));
                    break;

                case 6 :
                    System.out.println("0 - to shotdown" +
                            "\n 1 - to print contacts" +
                            "\n 2 - to add a new contact" +
                            "\n 3 - to update existing contact" +
                            "\n 4 - to remove an existing contact " +
                            "\n 5 - query if an existing contact exists" +
                            "\n 6 - to print a list of available actions ." +
                            "\n Choose your action : ");
                    break;

                case 0 :
                    System.out.println("Shutting down ...");
                    break;
            }
        }while (n != 0);
    }
}
