public class Ex3 {
    public static void main(String[] args){
        int [] v = {10, 1, 5, 8, 9, 7, 1, 5, 2, 3, 10};

        //calculando a media
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;

        //Calculo desvio padrao
        double soma = 0, desvio;
        for (int i = 0; i < v.length; i++) {
            soma += Math.pow((v[i] - media), 2);
        }

        desvio = Math.pow((1/(v.length-1)) *soma, 1/2);

        System.out.println("O desvio padrao é: " + desvio);
    }
}
