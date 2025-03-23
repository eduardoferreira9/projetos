import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println();
    
      System.out.print("De qual número você deseja saber a tabuada? ");
      int num = sc.nextInt();
    
      for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + num * i);
      }
    sc.close();
  }
}
