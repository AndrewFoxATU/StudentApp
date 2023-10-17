package ie.atu;

import java.util.Scanner;
public class StudentApp {
    String studentName;
    String studentEmail;
    String studentCourse;

    public void displayInfo() {
        System.out.println("Name: " + studentName + " - " + studentEmail + ", Course: " + studentCourse);
    }
}