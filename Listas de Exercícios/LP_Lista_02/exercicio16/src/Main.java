import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        System.out.printf("Volume do cone: %.2f\n", volume);
    }
}