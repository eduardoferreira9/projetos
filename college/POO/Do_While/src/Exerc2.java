import java.util.Scanner;

public class Exerc2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis para contar as idades
        int idade0 = 0, idade16 = 0, idade31 = 0, idade46 = 0, idade60 = 0, i = 1, idade;

        do {
            System.out.print("Digite uma idade: ");
            idade = sc.nextInt();
            if (idade >= 0 && idade <= 15) {
                idade0++;
                i++;
            } else if (idade >= 16 && idade <= 30) {
                idade16++;
                i++;
            } else if (idade >= 31 && idade <= 45) {
                idade31++;
                i++;
            } else if (idade >= 46 && idade <= 60) {
                idade46++;
                i++;
            } else if (idade > 60) {
                idade60++;
                i++;
            } else {
                System.out.println("Digite uma idade válida!");
            }

        }while (i <= 50);


        System.out.println("\nResumo do percentual de idades:");
        System.out.println("0-15 anos: " + (idade0*100)/50 + "%");
        System.out.println("16-30 anos: " + (idade16*100)/50 + "%");
        System.out.println("31-45 anos: " + (idade31*100)/50 + "%");
        System.out.println("46-60 anos: " + (idade46*100)/50 + "%");
        System.out.println("Mais de 60 anos: " + (idade60*100)/50 + "%");

        sc.close();
    }
}
