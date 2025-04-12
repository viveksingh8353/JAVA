package Loop;

import java.util.Scanner;

public class sumOfFirstNaturalNo {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Natural No: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            continue;
        }
        System.out.println("sum = " + sum);

    }
}
