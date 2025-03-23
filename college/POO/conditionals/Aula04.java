

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float base, altura, areaTriangulo;

        System.out.print("Digite o valor da altura: ");
        altura = sc.nextFloat();

        System.out.print("Digite o valor da base: ");
        base = sc.nextFloat();

        areaTriangulo = (base * altura) / 2; 
        System.out.print("O valor da área do triângulo é: " + areaTriangulo);

        sc.close();
    }
}
