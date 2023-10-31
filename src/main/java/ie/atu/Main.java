package ie.atu;

public class Main {
    public static void main(String[] args) {
        StudentApp[] students = new StudentApp[3];

        //calls getUserInput() from studentApp.java 3 times
        for (int i = 0; i < 3; i++) {
            students[i] = new StudentApp();
            System.out.println("Enter details for Student " + (i+1) + ": ");
            students[i].getUserInput();
        }

        //calls displayInfo() and getters from studentApp.java 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i+1) + " Details: ");
            students[i].displayInfo();
        }
    }
}
