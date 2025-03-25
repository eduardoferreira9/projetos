public class Exerc1 {
    public static void main(String[] args) {
        int soma = 0, i = 100;
        do {
            soma+=i;
            i+=2;
        }while (i <= 500);

        System.out.print("A soma dos valores é: " + soma);

    }
}