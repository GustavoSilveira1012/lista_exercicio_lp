import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Raiz única: x = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Raízes: x1 = %.2f, x2 = %.2f\n", x1, x2);
            }
        }
    }
}