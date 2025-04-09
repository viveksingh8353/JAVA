package conditional_Statement;

import java.util.Scanner;

public class largestOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Number:");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(" the largest is first nummer: " +num1);
        }else{
            System.out.println( " the largest is second number: " +num2);
        }
    }
}
