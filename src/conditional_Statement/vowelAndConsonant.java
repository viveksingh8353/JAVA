package conditional_Statement;

public class vowelAndConsonant {
    public static void main(String args[]){
        char ch = 'a';
        if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
