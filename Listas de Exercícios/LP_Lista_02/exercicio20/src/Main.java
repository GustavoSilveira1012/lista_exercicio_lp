import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a raiz x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite a raiz x2: ");
        double x2 = sc.nextDouble();

        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.printf("Equação: x² + (%.2f)x + (%.2f) = 0\n", b, c);
    }
}