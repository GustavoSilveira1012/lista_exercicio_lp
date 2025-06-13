import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean perdeu = false;

            outer:
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%d x %d = ", i, j);
                    int resposta = sc.nextInt();
                    if (resposta != i * j) {
                        System.out.println("Você errou! Fim de jogo.");
                        perdeu = true;
                        break outer;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String opcao = sc.next();
            jogarNovamente = opcao.equalsIgnoreCase("s");
        }
    }
}