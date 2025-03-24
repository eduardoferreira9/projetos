import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        int numeros, i = 1, somatoria = 0;
        
        while(i <= 20) {
            System.out.print("Digite um número: ");
            numeros = sc.nextInt();

            somatoria += numeros;
            i++;
        }
        System.out.print("A soma dos valores finais é: " + somatoria);
        sc.close();
    }
}