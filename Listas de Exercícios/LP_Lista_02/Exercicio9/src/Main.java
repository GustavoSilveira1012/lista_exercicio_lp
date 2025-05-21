import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância em quilômetros: ");
        double km = scanner.nextDouble();
        double milhas = km * 0.621371;
        System.out.println("Distância em milhas: " + milhas);
        scanner.close();
    }
}