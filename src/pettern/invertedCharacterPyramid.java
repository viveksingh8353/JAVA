package pettern;

//        A B C D
//        A B C
//        A B
//        A

public class invertedCharacterPyramid {
    public static void main(String args[]){
        for (char i = 'D'; i >= 'A'; i--){
            for (char j = 'A'; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
