import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        word=in.next();

        word = word.toLowerCase();
        word = word.replaceAll("[^a-z]","");


        if (isPalindrome(word))
            System.out.println("É palindromo");
        else
            System.out.println("Não é palindromo");
    }
    public static boolean isPalindrome(String word){
        for (int i=0;i<word.length()/2;i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                return false;
        }
        return true;
    }

    }