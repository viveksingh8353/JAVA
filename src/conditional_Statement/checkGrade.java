package conditional_Statement;

import java.util.*;

public class checkGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 75){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade C");
        }

    }
}
