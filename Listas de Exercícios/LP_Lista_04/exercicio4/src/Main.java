public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão: Celsius → Fahrenheit");
        System.out.println("------------------------------------------");
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------------------------");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = celsius * 9.0 / 5 + 32;
            System.out.printf("%d°C\t\t%.2f°F\n", celsius, fahrenheit);
        }
    }
}