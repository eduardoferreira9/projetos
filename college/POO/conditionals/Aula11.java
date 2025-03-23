

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int menorNumero = sc.nextInt(); 

        for (int i = 1; i < 3; i++) { 
            System.out.print("Digite um número: ");
            int numbers = sc.nextInt();
            
            if (numbers < menorNumero) {
                menorNumero = numbers;
            }
        }

        System.out.println("O menor número digitado foi: " + menorNumero);

        sc.close();
    }
}
