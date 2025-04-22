import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite tres numeros diferentes separados por espaço:");

        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

       if (n1 > n2) {
           int temp = n1;
           n1 = n2;
           n2 = temp;
        }if (n2 > n3) {
           int temp = n2;
           n2 = n3;
           n3 = temp;
       }if (n1 > n2) {
           int temp = n1;
           n1 = n2;
           n2 = temp;
       }

        System.out.println("Numeros em ordem crescente: " + n1 + ", " + n2 + ", " +n3);
    }
}