import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int dimensao = 4;
        int[][] matriz = new int[dimensao][dimensao];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in); // Embora não usado para preencher, é boa prática ter

        System.out.println("Preenchendo a matriz 4x4 com números inteiros positivos aleatórios...");

        // Preenche a matriz
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Gera números aleatórios de 1 a 100
            }
        }

        System.out.println("\nMatriz 4x4 preenchida:");
        // Exibe a matriz
        imprimirMatriz(matriz);

        scanner.close();
    }

    //Metodo auxilia para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]); // Imprime com formatação
            }
            System.out.println(); // Nova linha para a próxima linha da matriz
        }
    }
}