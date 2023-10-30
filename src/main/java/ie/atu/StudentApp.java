package ie.atu;

import java.util.Scanner;
public class StudentApp {

    private String studentName;
    private String studentEmail;
    private String studentCourse;

    // Default constructor
    public StudentApp() {
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse = "";
    }
    // Constructor
    public StudentApp(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    //Getters
    public String getName() {
        return studentName;
    }
    public String getEmail() {
        return studentEmail;
    }
    public String getCourse() {
        return studentCourse;
    }

    // Setters
    public void setName(String studentName) {
        this.studentName = studentName;
    }
    public void setEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public void setCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void getUserInput() { // called from main.java
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter Student Course: ");
        this.studentCourse = scanner.nextLine();
    }

    public void displayInfo() { // called from main.java
        System.out.println("Name: " + studentName + ", Email: " + studentEmail + ", Course: " + studentCourse);
    }
}
