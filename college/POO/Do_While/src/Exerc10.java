import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        String senhaDefinida = "123", senhaNova;

        do {
            System.out.print("Digite sua senha: ");
            senhaNova = sc.nextLine();

            if (senhaNova.equals(senhaDefinida)) { //Equals usado para comparar string
                System.out.print("Seja bem-vindo!");
                break;
            } else{
                System.out.print("Senha incorreta, tente novamente!");
            }
        }while (senhaDefinida != senhaNova);
        sc.close();
    }
}
