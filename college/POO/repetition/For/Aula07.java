import java.util.Scanner;

public class Aula07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();

    int num, contagem = 0;
    
    for (;;) {
      System.out.print("Digite um número: ");
      num = sc.nextInt();

      if (num < 0){
        System.out.print("Apenas válidos números positivos!. Encerrado.");
        break;
      } else {
        contagem += num;
      }
      sc.close();
    }
    System.out.println("A soma dos números é: " + contagem);
  }
}