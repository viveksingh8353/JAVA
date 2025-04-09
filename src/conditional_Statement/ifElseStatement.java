package conditional_Statement;
import java.util.*;

public class ifElseStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num %2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    
}
