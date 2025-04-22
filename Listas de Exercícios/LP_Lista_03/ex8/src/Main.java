import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite qualquer numero:");
        number = in.nextDouble();

        if (number % 2 == 0) {
            System.out.println(number + " é par");
        }else {
            System.out.println(number + " é impar");
        }
    }
}