import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        int maior, menor, somatoria = 0;

        if (a > b) {
            menor = b;
            maior = a;
        } else {
            menor = a;
            maior = b;
        }

        int i = menor;

        while (i <= maior) {
            somatoria += i;
            i++;
        }
        System.out.print("O valor da somatória final é: " + somatoria);
        sc.close();
    }
}