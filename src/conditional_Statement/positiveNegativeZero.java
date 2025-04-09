package conditional_Statement;

import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is positve!!");
        }else if(num < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
