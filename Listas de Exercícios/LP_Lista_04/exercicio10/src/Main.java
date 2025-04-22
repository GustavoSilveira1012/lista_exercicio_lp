import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, previous=0, next=1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");
        n = in.nextInt();

        if (n>0){
            while (next<n){
                System.out.println(next);
                next+=previous;
                previous=next;
            }

        }else {
            System.out.println("Valor invalido");
        }
    }
}