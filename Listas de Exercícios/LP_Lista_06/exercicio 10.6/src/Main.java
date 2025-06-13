public class Main {

    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int alvo = 13;

        int resultado = buscaBinaria(numeros, alvo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}