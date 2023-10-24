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

    public void displayInfo() {
        System.out.println("Name: " + studentName + " - " + studentEmail + ", Course: " + studentCourse);
    }
}