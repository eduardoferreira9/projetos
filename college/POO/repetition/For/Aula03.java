import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        int numeros, somatoria = 0;


        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número: ");
            numeros = sc.nextInt();

            somatoria += numeros;
        }
        System.out.print("A somatoria dos números digitados é: " + somatoria);
        
        sc.close();
    }
}