

import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite um valor: ");
        int numeros = sc.nextInt();

        if (numeros % 2 == 0) {
            numeros += 5;
            System.out.print(numeros);
        } else {
            numeros += 8;
            System.out.print(numeros);
        }
        
        sc.close();
    }
}
