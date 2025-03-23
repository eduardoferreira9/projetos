

import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite seu salário: ");
        float salario = sc.nextFloat();

        double impostoRenda = salario * 0.05;
        System.out.println("Deverá ser pago " + impostoRenda + " de imposto de renda");

        sc.close();
    }
}
