package conditional_Statement;

import java.util.Scanner;

public class logicPuzzle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num_1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num_3 = sc.nextInt();

        if (num_1 == num_2 && num_2 == num_3) {
            System.out.println("All are equal");
        } else if ((num_1 == num_2 && num_2 != num_3) || (num_1 == num_3 && num_2 != num_3) || (num_2 == num_3 && num_1 != num_2)) {
            System.out.println("Two are equal");
        } else if (num_1 < num_2 && num_2 < num_3) {
            System.out.println("Increasing");
        } else if (num_1 > num_2 && num_2 > num_3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Unordered");
        }
    }
}
