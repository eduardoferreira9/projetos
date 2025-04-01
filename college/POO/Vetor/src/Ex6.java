import java.util.Scanner;
import java.text.Normalizer;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Normaliza para remover acentos e ignora 'ç' conforme pedido
        String palavraNormalizada = Normalizer.normalize(palavra, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "") // Remove acentos
                .replaceAll("[^a-zA-Z]", ""); // Remove incluindo ç

        System.out.println("Palavra inserida: " + palavra);
        System.out.println("Posição das letras no alfabeto (A=1, B=2, ...):");

        for (int i = 0; i < palavraNormalizada.length(); i++) {
            char letra = palavraNormalizada.charAt(i);
            // Converte para maiúscula para facilitar o cálculo da posição
            char letraMaiuscula = Character.toUpperCase(letra);

            // Verifica se é uma letra entre A e Z
            if (letraMaiuscula >= 'A' && letraMaiuscula <= 'Z') {
                int posicao = letraMaiuscula - 'A' + 1; // 'A' é 0, então +1 para ser 1-26
                System.out.println("'" + palavra.charAt(i) + "' (original) / '" + letraMaiuscula + "' -> Posição " + posicao);
            }
        }

        scanner.close();
    }
}