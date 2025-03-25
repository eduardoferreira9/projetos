import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somatoria = 0, i = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                somatoria += numero;
            }
            i++;
        }while (i < 20);

        System.out.print("A somatoria dos números digitados é: " + somatoria);
        sc.close();
    }
}
