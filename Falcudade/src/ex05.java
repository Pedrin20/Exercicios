import java.util.Scanner;
public class ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int resultado;

        System.out.print("Coloque o seu numero: ");
        number1 = input.nextInt();

        if (number1 >= 0) {
            resultado = number1 * 2;
        } else {
            resultado = number1 * 3;
        }
        System.out.println("Seu resultado é esse: " + resultado);

        input.close();

    }
}
