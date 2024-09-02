package study;
import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int id;
    private String disease;

    public Patient(String name, int id, String disease) {
        this.name = name;
        this.id = id;
        this.disease = disease;
    }


    public String toString() {
        return "Patient ID: " + id + "\nName: " + name + "\nDisease: " + disease;
    }
}

public class HospitalManagementSystem {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    displayPatients();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Disease: ");
        String disease = scanner.nextLine();

        Patient patient = new Patient(name, id, disease);
        patients.add(patient);

        System.out.println("Patient added successfully!");
    }

    private static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients to display.");
            return;
        }

        for (Patient patient : patients) {
            System.out.println("\n" + patient);}}}