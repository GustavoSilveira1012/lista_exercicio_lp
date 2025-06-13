import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade inicial (m/s): ");
        double vi = sc.nextDouble();
        System.out.print("Aceleração (m/s²): ");
        double a = sc.nextDouble();
        System.out.print("Tempo (s): ");
        double t = sc.nextDouble();
        double vf = vi + a * t;
        System.out.printf("Velocidade final: %.2f m/s\n", vf);
    }
}