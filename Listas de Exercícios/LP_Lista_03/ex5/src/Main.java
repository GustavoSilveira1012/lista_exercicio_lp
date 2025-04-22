import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, score;

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o valor de suas duas notas:" );
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        score = (n1 + n2)/2;

        if (score >= 8.5) {
            System.out.println("Sua media foi: " + score + " Sua nota é A");
        } else if (score >= 7) {
            System.out.println("Sua media foi: " + score + " Sua nota é B");
        } else if (score >= 5) {
            System.out.println("Sua media foi: " + score + " Sua nota é C");
        }else {
            System.out.println("Sua media foi: " + score + " Sua nota é D");
        }
    }
}