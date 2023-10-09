import java.util.Scanner;
public class ex04 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Coloque o numero A: ");
            int A = input.nextInt();

            System.out.println("Coloque o numero B: ");
            int B = input.nextInt();

            int C;

            if (A == B) {
                C = A + B;
            } else {
                C = A * B;
            }
            System.out.println("Seu valor é esse:" + C);

    }
}