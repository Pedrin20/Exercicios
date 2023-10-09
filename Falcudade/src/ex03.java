import java.util.Scanner;

public class ex03 {
    public ex03() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque seu numero:");
        int number1 = input.nextInt();
        if (number1 % 2 == 0) {
            System.out.println("O número " + number1 + " é par.");
        } else {
            System.out.println("O número " + number1 + " é ímpar.");
        }

    }
}