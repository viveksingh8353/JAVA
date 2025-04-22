package pettern;

//            1
//           1 1
//          1 2 1
//         1 3 3 1

public class pascalsTringle {
    public static void main(String args[]){
        int rows = 4;
        for(int i = 0; i < rows; i++){
            int num = 1;
            for (int j = 1; j < rows - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print(num + " ");
                num = num *(i-k)/ (k + 1);
            }
            System.out.println();
        }
    }

}
