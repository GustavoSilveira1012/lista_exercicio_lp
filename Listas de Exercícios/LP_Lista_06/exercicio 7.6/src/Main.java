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
            if (n < 0) throw new IllegalArgumentException("Fatorial não definido para negativos.");
            if (n == 0 || n == 1) return 1;
            return n * calcularFatorial(n - 1);
        }
    }