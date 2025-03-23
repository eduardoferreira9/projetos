

import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Digite a distância em KM: ");
        float km = sc.nextFloat();

        System.out.print("Digite o tempo percorrido em horas: ");
        float hours = sc.nextFloat();

        double velocidadeMedia = km / hours;
        System.out.print("A velocidade média do carro foi de: " + velocidadeMedia);

        sc.close();
    }
}
