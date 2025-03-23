import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.print("O volume da esfera será: " + volumeEsfera);

        sc.close();
    }
}