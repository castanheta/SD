import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] InvertedWord = new char[word.length()];

        for(int i = 0; i<word.length(); i++){
            InvertedWord[i] = word.charAt(word.length()-i-1);
        }
        
        for(int j = 0; j< word.length(); j++){

            if(word.charAt(j) != InvertedWord[j]){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("It's a Palindrome!");
        sc.close();
    }
}