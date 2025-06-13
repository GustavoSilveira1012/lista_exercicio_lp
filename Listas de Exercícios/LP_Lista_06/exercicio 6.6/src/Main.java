import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        number= in.nextInt();

        System.out.println(number + "! = " + fatorial(number));
    }
    public static int fatorial(int n){
        int f=1;
        for(int i=n;i>1;i--)
            f*=i;

        return f;
    }
}