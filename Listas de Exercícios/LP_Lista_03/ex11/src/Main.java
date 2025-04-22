import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;


        Scanner in = new Scanner(System.in);

        System.out.println("---------------------------" + "\n MENU" + "\n---------------------------" + "\n1. Segunda-Feira" + "\n2. Terça-Feira" + "\n3. Quarta-Feira" + "\n4. Quinta-Feira" + "\n5. Sexta-Feira" + "\n6. Sábado" + "\n Domingo" + "\n---------------------------");
        System.out.println("Escolha uma opção:" + "\n---------------------------");

        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia da semana inexistente");
                break;
        }
    }
}