import java.util.Scanner;
import java.util.Random;

public class Exerc9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        Scanner sc = new Scanner(System.in);
        int tentativa;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = sc.nextInt();

            if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (tentativa != numeroAleatorio);
        sc.close();
    }
}
