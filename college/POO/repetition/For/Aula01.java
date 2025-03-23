import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis para contar as idades
        int idade0 = 0, idade16 = 0, idade31 = 0, idade46 = 0, idade60 = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite uma idade: ");
            int idade = sc.nextInt();

            if (idade >= 0 && idade <= 15) {
                idade0++;
            } else if (idade >= 16 && idade <= 30) {
                idade16++;
            } else if (idade >= 31 && idade <= 45) {
                idade31++;
            } else if (idade >= 46 && idade <= 60) {
                idade46++;
            } else if (idade > 60) {
                idade60++;
            } else {
                System.out.println("Digite uma idade válida!");
                i--; 
            }
        }

        System.out.println("\nResumo da contagem de idades:");
        System.out.println("0-15 anos: " + idade0);
        System.out.println("16-30 anos: " + idade16);
        System.out.println("31-45 anos: " + idade31);
        System.out.println("46-60 anos: " + idade46);
        System.out.println("Mais de 60 anos: " + idade60);

        sc.close();
    }
}
