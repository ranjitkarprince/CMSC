/*
 * Class: CMSC203
 * Instructor: Ahmed Tarek
 * Description: This is the driver class for the Patient and Procedure
 *              classes. It collects patient and procedure information,
 *              displays the information, and calculates total charges.
 * Due: 10/XX/2026
 * Platform/compiler: Eclipse / Java
 *
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Print your Name here: Prince Ranjitkar
 */

import java.util.Scanner;

public class PatientDriverApp {

    /*
     * The main method starts the program.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Patient information
        System.out.println("Enter Patient Information");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("ZIP Code: ");
        String zipCode = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Emergency Contact Name: ");
        String emergencyName = scanner.nextLine();

        System.out.print("Emergency Contact Phone: ");
        String emergencyPhone = scanner.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName,
                streetAddress, city, state, zipCode,
                phoneNumber, emergencyName, emergencyPhone);

        System.out.println();
        System.out.println("Patient information saved.");
        System.out.println();

        // Procedure 1
        System.out.println("Enter Procedure 1 Information");

        System.out.print("Procedure Name: ");
        String procedureName1 = scanner.nextLine();

        System.out.print("Procedure Date: ");
        String procedureDate1 = scanner.nextLine();

        System.out.print("Practitioner Name: ");
        String practitionerName1 = scanner.nextLine();

        System.out.print("Charges: ");
        double charges1 = scanner.nextDouble();
        scanner.nextLine();

        Procedure procedure1 = new Procedure();

        procedure1.setProcedureName(procedureName1);
        procedure1.setProcedureDate(procedureDate1);
        procedure1.setPractitionerName(practitionerName1);
        procedure1.setCharges(charges1);

        System.out.println();
        System.out.println("Procedure 1 saved.");
        System.out.println();

        // Procedure 2
        System.out.println("Enter Procedure 2 Information");

        System.out.print("Procedure Name: ");
        String procedureName2 = scanner.nextLine();

        System.out.print("Procedure Date: ");
        String procedureDate2 = scanner.nextLine();

        Procedure procedure2 = new Procedure(procedureName2, procedureDate2);

        System.out.print("Practitioner Name: ");
        String practitionerName2 = scanner.nextLine();
        procedure2.setPractitionerName(practitionerName2);

        System.out.print("Charges: ");
        double charges2 = scanner.nextDouble();
        scanner.nextLine();
        procedure2.setCharges(charges2);

        System.out.println();
        System.out.println("Procedure 2 saved.");
        System.out.println();

        // Procedure 3
        System.out.println("Enter Procedure 3 Information");

        System.out.print("Procedure Name: ");
        String procedureName3 = scanner.nextLine();

        System.out.print("Procedure Date: ");
        String procedureDate3 = scanner.nextLine();

        System.out.print("Practitioner Name: ");
        String practitionerName3 = scanner.nextLine();

        System.out.print("Charges: ");
        double charges3 = scanner.nextDouble();
        scanner.nextLine();

        Procedure procedure3 = new Procedure(procedureName3, procedureDate3,
                practitionerName3, charges3);

        System.out.println();
        System.out.println("Procedure 3 saved.");
        System.out.println();

        // Display information
        displayPatient(patient);

        System.out.println();

        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        System.out.println();

        double totalCharges =
                calculateTotalCharges(procedure1, procedure2, procedure3);

        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        System.out.println();
        System.out.println("The program was developed by a Student: Your Name <07/27/24>");

        scanner.close();
    }

    /*
     * Displays the information of a patient.
     */
    public static void displayPatient(Patient patient) {
        System.out.println("PATIENT INFORMATION");
        System.out.println(patient);
    }

    /*
     * Displays the information of a procedure.
     */
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    /*
     * Calculates and returns the total charges of three procedures.
     */
    public static double calculateTotalCharges(Procedure procedure1,
                                               Procedure procedure2,
                                               Procedure procedure3) {

        double total;

        total = procedure1.getCharges()
                + procedure2.getCharges()
                + procedure3.getCharges();

        return total;
    }
}