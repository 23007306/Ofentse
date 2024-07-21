import java.util.Scanner;

public class Ofentse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 80) {
                System.out.println("Outstanding achievement");
            } else if (marks >= 70) {
                System.out.println("Meritorius achievement");
            } else if (marks >= 60) {
                System.out.println("Substantial achievement");
            } else if (marks >= 50) {
                System.out.println("Moderate achievement");
            } else if (marks >= 40) {
                System.out.println("Adequate avhievement");
            } else if (marks >= 30) {
                System.out.println("elementary achievement");
            } else {
                System.out.println("Not achieved Fail");
            }
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}