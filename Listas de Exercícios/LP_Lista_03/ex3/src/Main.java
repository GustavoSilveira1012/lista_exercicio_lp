import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery, score3, score4;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        score1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = in.nextDouble();

        System.out.println("Digite a terceira nota: ");
        score3 = in.nextDouble();

        System.out.println("Digite a quarta nota: ");
        score4 = in.nextDouble();

        mean = (score1 + score2 + score3 + score4)/4;
        System.out.println("Media =" + mean);

        String mensage;
        System.out.println(mean>=6.0?"Aprovado":"Reprovado");

        if(mean>6.0) {
            System.out.println("aprovado");
        }else{
            System.out.println("Informe a nota de recuperação");
            recovery = in.nextDouble();

            mean = (mean + recovery)/2;
        }
    }
}