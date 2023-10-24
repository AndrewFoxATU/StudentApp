package ie.atu;

import java.util.Scanner;
public class StudentApp {
    String studentName;
    String studentEmail;
    String studentCourse;


    // Default Constructor
    public  StudentApp() {
        this.studentName = "John";
        this.studentEmail = "JohnDoe@atu.ie";
        this.studentCourse = "Software";
    }

    // Constructor
    public StudentApp(String studentName, String studentEmail, String studentCourse){
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    // Prompting User to input details
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter Student Course: ");
        this.studentCourse = scanner.nextLine();

    }

    public void displayInfo() {
        System.out.println("Name: " + studentName + " - " + studentEmail + ", Course: " + studentCourse);
    }

    public class Main {
        public static void main(String[] args) {
            // Create a new person object
            StudentApp johnDoe = new StudentApp("Andrew", "G00417373@atu.ie", "softwareEngineering");
            // Call displayInfo()
            johnDoe.displayInfo();
        }
    }
}