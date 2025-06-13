import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = sc.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = sc.nextInt();

        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = sc.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = sc.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar essas matrizes.");
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] produto = new int[linhasA][colunasB];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int[] linha : produto) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}