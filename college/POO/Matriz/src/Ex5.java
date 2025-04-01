import java.util.Scanner;
import java.math.BigInteger; // Usar BigInteger para fatoriais e combinações

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem (n) da matriz: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("A ordem da matriz deve ser um número positivo.");
            sc.close();
            return;
        }

        int[][] matrizCombinacoes = new int[n][n];
        final int LIMITE = 1000; // Limite de truncamento

        System.out.println("\nCalculando a Matriz de Combinações C(i, j):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    matrizCombinacoes[i][j] = 0; // Ajuste conforme regra j > i
                } else {
                    // Calcula C(i, j)
                    BigInteger combinacao = calcularCombinacao(i, j);

                    // Compara com o limite e ajusta/trunca se necessário
                    if (combinacao.compareTo(BigInteger.valueOf(LIMITE)) > 0) {
                        matrizCombinacoes[i][j] = LIMITE;
                    } else {
                        matrizCombinacoes[i][j] = combinacao.intValue(); // Converte para int
                    }
                }
            }
        }

        // Imprime a matriz resultante
        imprimirMatriz(matrizCombinacoes, "\nMatriz de Combinações Resultante:");

        sc.close();
    }

    // Metodo para calcular fatorial usando BigInteger para evitar overflow
    public static BigInteger calcularFatorial(int num) {
        if (num < 0) {
            return BigInteger.ZERO; // Fatorial de negativo não definido (ou erro)
        }
        BigInteger fatorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        return fatorial;
    }

    // Metodo para calcular combinação C(n, k) usando BigInteger
    public static BigInteger calcularCombinacao(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO; // Combinação inválida
        }
        if (k == 0 || k == n) {
            return BigInteger.ONE;
        }
        // Otimização: C(n, k) = C(n, n-k), calcular com o menor k
        if (k > n / 2) {
            k = n - k;
        }

        // Calcula usando a fórmula n! / (k! * (n-k)!)
        BigInteger nFat = calcularFatorial(n);
        BigInteger kFat = calcularFatorial(k);
        BigInteger nMenosKFat = calcularFatorial(n - k);

        return nFat.divide(kFat.multiply(nMenosKFat));
    }

    // Metodo auxiliar para imprimir matriz (reutilizado)
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        int n = matriz.length;
        // Determinar a largura máxima necessária para formatação
        int maxWidth = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int width = String.valueOf(matriz[i][j]).length();
                if (width > maxWidth) {
                    maxWidth = width;
                }
            }
        }
        String format = "%" + (maxWidth + 1) + "d"; // Cria formato ex: "%5d"

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(format, matriz[i][j]);
            }
            System.out.println();
        }
    }
}