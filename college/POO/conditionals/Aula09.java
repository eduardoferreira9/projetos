

import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso atual (kg): ");
        float pesoAtual = sc.nextFloat();

        System.out.print("Digite o seu peso alvo (kg): ");
        float pesoAlvo = sc.nextFloat();

        float pesoPerdido = pesoAtual - pesoAlvo;

        double porcentagemPerda = (pesoPerdido / pesoAtual) * 100;

        System.out.printf("Você precisa perder %.2f kg (%.2f%% do seu peso atual) para atingir seu objetivo.%n", pesoPerdido, porcentagemPerda);

        sc.close();
    }
}
