import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        number = in.nextInt();

        //for (declar_var_ctrl ; teste_logico ; inc)
        for(int i=0; i<=10; i+=2){
            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }
}