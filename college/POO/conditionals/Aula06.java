

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float valorCompra, valorTotal, desconto, comissao;

        System.out.print("Digite o valor da compra: ");
        valorCompra = sc.nextFloat();

        System.out.print("Digite o percentual de desconto: ");
        desconto = sc.nextFloat();
        desconto = desconto / 100; 

        valorTotal = valorCompra - (valorCompra * desconto); 
        
        System.out.printf("O valor final da compra é R$: %.2f%n", valorTotal);

        comissao = valorTotal * 0.03f; 
        System.out.printf("A comissão do vendedor é de R$: %.2f%n", comissao);

        sc.close();
    }
}