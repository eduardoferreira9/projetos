import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println();

        System.out.print("Digite um  número, que será limite: ");
        int numeroLimite = sc.nextInt();

        for (int i = 0; i <=  numeroLimite; i++) {
            System.out.println(i);
        }
        System.out.println("Os números chegaram ao limite!");
        sc.close();
    }    
}
