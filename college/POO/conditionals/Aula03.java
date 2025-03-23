

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        float peso, altura;
        double alturaMetro, imc;

        System.out.print("Digite o seu peso(kg): ");
        peso = sc.nextFloat();

        System.out.print("Digite a sua altura(cm): ");
        altura = sc.nextFloat();

        alturaMetro = altura / 100.0;

        imc = peso / Math.pow(alturaMetro, 2);
        System.out.print("Seu IMC é: " + imc);

        sc.close();
    }
}
