

import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite o valor do produto: ");
        float valorProduto = sc.nextFloat();

        double novoValor = valorProduto * 1.25; 

        System.out.printf("O valor do produto era R$ %.2f, agora vale R$ %.2f%n", valorProduto, novoValor);

        sc.close();
    }
}
