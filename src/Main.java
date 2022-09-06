import java.util.Scanner;

public class Main {

    public static Student[] students;

    public static void main(String[] args) {
        Integer registrationCount = InputUtility.askInt("How many students do you want to register? ");
        students = new Student[registrationCount];

        for(int i=0; i<registrationCount; i++) {

            students[i] = StudentUtility.prepareStudent();
        }
    }
}
