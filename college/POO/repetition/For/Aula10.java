import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        String senhaDefinida = "123", senhaNova;

        for (;;) {
            System.out.print("Digite sua senha: ");
            senhaNova = sc.nextLine();

            if (senhaNova.equals(senhaDefinida)) { //Devemos usar o equals para comparar Strings!
                System.out.print("Seja bem-vindo!");
                break;
            } else{
                System.out.print("Senha incorreta, tente novamente!");
            }
            sc.close();
        }  
    }
}
