package conditional_Statement;

import java.util.Scanner;

public class checkPassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks > 33){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
    }
}
