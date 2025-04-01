import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a ordem (n) das matrizes quadradas: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A ordem da matriz deve ser um número positivo.");
            scanner.close();
            return;
        }

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizSoma = new int[n][n];
        int[][] matrizTransposta = new int[n][n];

        System.out.println("\nPreenchendo Matriz A com valores aleatórios positivos:");
        preencherMatrizAleatoria(matrizA, random);
        imprimirMatriz(matrizA, "Matriz A:");

        System.out.println("\nPreenchendo Matriz B com valores aleatórios positivos:");
        preencherMatrizAleatoria(matrizB, random);
        imprimirMatriz(matrizB, "Matriz B:");

        //Calcula a soma
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        imprimirMatriz(matrizSoma, "\nMatriz Soma (A + B):");

        //Calcula a transposta da matriz soma
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTransposta[j][i] = matrizSoma[i][j];
            }
        }
        imprimirMatriz(matrizTransposta, "\nMatriz Transposta da Soma:");

        scanner.close();
    }

    //Metodo auxiliar para preencher matriz com positivos aleatórios
    public static void preencherMatrizAleatoria(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números de 1 a 100
            }
        }
    }

    //Metodo auxiliar para imprimir matriz com título
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