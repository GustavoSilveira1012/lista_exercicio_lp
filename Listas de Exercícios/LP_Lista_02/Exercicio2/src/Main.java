import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number, result;

    System.out.println("Digite um numero inteiro: ");

    Scanner in = new Scanner(System.in);
    number = in.nextInt();

    result = number * number;
    System.out.println("O quadrado de "+number+" eh igual a "+result);
    }
}