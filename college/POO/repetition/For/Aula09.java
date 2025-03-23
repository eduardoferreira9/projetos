import java.util.Scanner;
import java.util.Random;

public class Aula09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println();

        int numeroAleatorio,numeroUsuario;
        numeroAleatorio = rand.nextInt(101);

        for (;;) {
            System.out.print("Adivinhe o número do computador: ");
            numeroUsuario = sc.nextInt();

            if (numeroAleatorio == numeroUsuario) {
                System.out.print("Parabéns! Você acertou!");
                break;
            }
            sc.close();
        }     
    }
}
