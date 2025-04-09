package conditional_Statement;

import java.util.Scanner;

public class loginCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("username: ");
        String username = sc.next();
        System.out.print("password: ");
        String password = sc.next();

        if(username.equals("vivekthakur8353") && password.equals("vivek@5266")){
            System.out.println("Login Successfull!!");
        }else{
            System.out.println("wrong username and password!!");
        }
    }
}
