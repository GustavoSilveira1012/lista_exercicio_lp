import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();
        double km = milhas / 0.621371;
        System.out.println("Distância em quilômetros: " + km);
        scanner.close();
    }
}