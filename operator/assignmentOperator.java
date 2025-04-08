package operator;

public class assignmentOperator {
   
        public static void main(String[] args) {
            int a = 10;
            
            a += 5; // a = 15
            System.out.println("a += 5 → " + a);
            
            a -= 3; // a = 12
            System.out.println("a -= 3 → " + a);
            
            a *= 2; // a = 24
            System.out.println("a *= 2 → " + a);
            
            a /= 4; // a = 6
            System.out.println("a /= 4 → " + a);
            
            a %= 5; // a = 1
            System.out.println("a %= 5 → " + a);
        }
    }
