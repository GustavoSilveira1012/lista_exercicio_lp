import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            long resultado = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + resultado);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}