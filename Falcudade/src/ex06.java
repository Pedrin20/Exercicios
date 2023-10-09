import java.util.Scanner;
public class ex06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor booleano (true ou false): ");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite o segundo valor booleano (true ou false): ");
        boolean valor2 = scanner.nextBoolean();

        // Verifica se ambos os valores são VERDADEIROS
        boolean ambosVerdadeiros = valor1 && valor2;

        // Verifica se ambos os valores são FALSOS
        boolean ambosFalsos = !valor1 && !valor2;

        if (ambosVerdadeiros) {
            System.out.println("Ambos os valores são VERDADEIROS.");
        } else if (ambosFalsos) {
            System.out.println("Ambos os valores são FALSOS.");
        } else {
            System.out.println("Os valores não são todos VERDADEIROS nem todos FALSOS.");
        }

        // Fecha o Scanner
        scanner.close();

    }
}
