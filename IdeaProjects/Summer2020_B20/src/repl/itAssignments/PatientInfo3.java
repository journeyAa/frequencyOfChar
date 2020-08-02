package repl.itAssignments;

import java.util.Scanner;

public class PatientInfo3 {
    public static void main(String[] args) {
        String firstName ="";
        String lastName = "";
        String fullName = firstName + ", " + lastName;
        String email = "";
        String street = "";
        String state = "";
        String city = "";
        String address = "";
        String contacts = "";
        int age = 0;
        int zipcode = 0;
        double height = 0;
        double weight = 0;
        boolean isMarried = true;
        long workPhoneNumber = 0;
        long personalPhoneNumber = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        fullName = firstName + ", " + lastName;

        System.out.println("Enter your email");
        email = scan.next();

        scan.nextLine();//to capture Enter key press

        System.out.println("Enter your street");
        street = scan.nextLine();

        System.out.println("Enter your city");
        city = scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipcode= scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        contacts = "work phone number - " + workPhoneNumber + ", personal phone number - "
                + personalPhoneNumber + ", email: " + email;

        address = street + ", " + city + ", "+ state + ", " + zipcode;

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);








































    }
}
