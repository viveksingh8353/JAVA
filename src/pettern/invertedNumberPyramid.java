package pettern;
//    1 2 3 4
//    1 2 3
//    1 2
//    1


public class invertedNumberPyramid {
    public static void main(String args[]){
        for (int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
