import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do primeiro grau.");
        } else {
            double x = -b / a;
            System.out.printf("Solução: x = %.2f\n", x);
        }
    }
}