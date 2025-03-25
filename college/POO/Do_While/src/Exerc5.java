import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println();

        System.out.print("Digite um  número, que será limite: ");
        int nLimite = sc.nextInt(), i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i <= nLimite);
        System.out.println("Os números chegaram ao limite!");
        sc.close();
    }    
}
