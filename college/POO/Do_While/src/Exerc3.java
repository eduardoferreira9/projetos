import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor pra a: ");
        int a = sc.nextInt();

        System.out.print("Digite um valor para b: ");
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
        do {
            somatoria += i;
            i++;
        }while (i<=maior);


        System.out.print("A soma dos valores é: " + somatoria);

        sc.close();
    }
}