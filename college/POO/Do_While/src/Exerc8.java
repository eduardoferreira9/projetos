import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("De qual número você deseja saber a tabuada? ");
      int num = sc.nextInt(), i = 1 ;
      do {
          System.out.println(num + " x " + i + " = " + num * i);
          i++;
      }while (i<=10);
    sc.close();
  }
}
