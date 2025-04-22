import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;


        Scanner in = new Scanner(System.in);

        System.out.println("---------------------------" + "\n MENU" + "\n---------------------------" + "\n1. 5" + "\n2. 6" + "\n3. 7" + "\n4. 8" + "\n5. 9" + "\n---------------------------");
        System.out.println("Escolha uma opção:" + "\n---------------------------");

        option = in.nextInt();

        switch (option){
            case 5:
                System.out.println("Usuario Valido");
                break;
            case 6:

                System.out.println("Usuario Valido");
                break;
            case 7:

                System.out.println("Usuario Valido");
                break;
            case 8:
                System.out.println("Usuario Valido");
                break;
            case 9:
                System.out.println("Usuario Valido");
                break;
            default:
                System.out.println("Usuario Invalido");
                break;
        }
    }
}