import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money, troco, valor;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira seu Dinheiro:  ");
        money = in.nextDouble();

        System.out.println("--------------------" +
                "\n MENU" +
                "\n Escolha uma das opções Abaixo" +
                "\n 1. Café Expresso R$ 0,50" +
                "\n 2. Café Longo R$ 1,00" +
                "\n 3. Capuccino R$ 2,50" +
                "\n 4. Chocolate R$ 2,00" +
                "\n --------------------");
        System.out.println("Escolha uma opção: " +
                "\n --------------------");
        option = in.nextInt();

        switch(option) {
            case 1:
                valor = 0.5;
                troco = money - valor;
                System.out.println("Bebida Selecionada: Café Expresso" +
                        "\nSeu Troco: R$" + troco);
                break;
            case 2:
                valor = 1;
                troco = money - valor;
                System.out.println("Bebida Selecionada: Café Longo" +
                        "\nSeu Troco: R$" + troco);
                break;
            case 3:
                valor = 2.5;
                troco = money - valor;
                System.out.println("Bebida Selecionada: Capuccino" +
                        "\nSeu Troco: R$" + troco);
                break;
            case 4:
                valor = 2;
                troco = money - valor;
                System.out.println("Bebida Selecionada: Chocolate" +
                        "\nSeu Troco: R$" + troco);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}