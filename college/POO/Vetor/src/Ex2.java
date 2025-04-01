import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //declaracao do numero n
        System.out.print("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.print("A quantidade de numeros deve ser maior que zero!!");
        }

        double[] v = new double[n];
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        //lendo e calulando o menor e maior numero
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero real: ");
            v[i] = sc.nextDouble();
            soma += v[i];

            if(v[i] > maior){
                maior = v[i];
            }

            if(v[i] < menor){
                menor = v[i];
            }
        }

        //calculo da media
        double media = soma/n;

        //Calculando quantos numeros sao maiores que a media
        int countMaioresOuIguais = 0;

        for(double c : v){
            if (c >= media) {
                countMaioresOuIguais++;
            }
        }

        // Exibindo os resultados
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);
        System.out.println("Quantidade de números maiores ou iguais à média: " + countMaioresOuIguais);

        sc.close();
    }
}
