package conditional_Statement;
 import java.util.Scanner;

public class voting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote. You must be at least 18 years old.");
        }

        scanner.close();
    }
}
