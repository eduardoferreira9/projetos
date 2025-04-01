import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a ordem (n) da matriz quadrada: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A ordem da matriz deve ser um número positivo.");
            scanner.close();
            return;
        }

        int[][] matriz = new int[n][n];

        System.out.println("\nPreenchendo a matriz com valores aleatórios positivos:");
        preencherMatrizAleatoria(matriz, random);
        imprimirMatriz(matriz, "Matriz Gerada:");

        long somaDiagonalPrincipal = 0;
        long somaDiagonalSecundaria = 0;
        long somaTrianguloSuperior = 0;
        long somaTrianguloInferior = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Diagonal Principal (i == j)
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
                // Diagonal Secundária (i + j == n - 1)
                if (i + j == n - 1) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
                // Triângulo Superior (j > i)
                if (j > i) {
                    somaTrianguloSuperior += matriz[i][j];
                }
                // Triângulo Inferior (j < i)
                if (j < i) {
                    somaTrianguloInferior += matriz[i][j];
                }
            }
        }

        System.out.println("\n--- Cálculos ---");
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
        System.out.println("Soma do Triângulo Superior: " + somaTrianguloSuperior);
        System.out.println("Soma do Triângulo Inferior: " + somaTrianguloInferior);

        scanner.close();
    }

    //Metodos auxiliares (reutilizados do exercício anterior)
    public static void preencherMatrizAleatoria(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números de 1 a 100
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}