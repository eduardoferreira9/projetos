import java.util.Scanner;

public class Exerc7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      int num, soma = 0;
      do {
      System.out.println("Digite um número positivo (Numero negativo para sair): ");
      num = sc.nextInt();
      if (num >= 0 && num % 2 == 0){
          soma += num;
      }
     }while (num >= 0);

      System.out.println("A soma dos números pares é: " + soma);
      sc.close();
  }
}
