

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        float materia1, materia2, materia3;
        double resultado;

        System.out.print("Digite o valor da primeira matéria-prima: ");
        materia1 = sc.nextFloat();

        System.out.print("Digite o valor da segunda matéria-prima: ");
        materia2 = sc.nextFloat();

        System.out.print("Digite o valor da terceira matéria-prima: ");
        materia3 = sc.nextFloat();

        resultado = materia1 + 3 * materia2 + 2 * materia3;
        System.out.print("O valor final do produto é: " + resultado);

        sc.close();
    }
}