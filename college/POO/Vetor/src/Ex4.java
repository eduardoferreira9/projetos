import java.util.Scanner;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Declarando o valor de N
        System.out.print("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.print("A quantidade de numeros deve ser maior que zero!!");
        }

        //Declarando os numeros
        double[] v = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            v[i] = sc.nextDouble();
        }

        // Ordenando em ordem não crescente (decrescente)
        Arrays.sort(v);

        // Imprimindo os números em ordem decrescente
        System.out.println("Números em ordem não crescente:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(" " + v[i]);
        }

        sc.close();

    }
}
