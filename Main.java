import java.util.Scanner;

class Person {
    public String surname;
    public String firstname;
    public String street;
    public String zipcode;
    public String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Surname:");
        surname = scanner.nextLine();
        System.out.println("Enter First Name:");
        firstname = scanner.nextLine();
        System.out.println("Enter Street:");
        street = scanner.nextLine();
        System.out.println("Enter Zip Code:");
        zipcode = scanner.nextLine();
        System.out.println("Enter City:");
        city = scanner.nextLine();
    }
    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstname);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipcode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person {
    String education;
    String position;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Education:");
        education = scanner.nextLine();
        System.out.println("Enter Position:");
        position = scanner.nextLine();
    }

    public void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Staff xyz = new Staff();
        xyz.initialize1();
        System.out.println("\nStaff Information:");
        xyz.print1();
    }
}