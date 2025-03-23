

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println();
          
        float media, valoresSomados = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite um valor: ");
            valoresSomados += sc.nextInt();
        }

        media = valoresSomados / 3;
        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}