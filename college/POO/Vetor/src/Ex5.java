import java.util.Scanner;
import java.text.Normalizer; // Para remover acentos

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase ou palavra: ");
        String entrada = scanner.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("A cadeia \"" + entrada + "\" é palíndroma.");
        } else {
            System.out.println("A cadeia \"" + entrada + "\" não é palíndroma.");
        }
        scanner.close();
    }

    public static boolean ehPalindromo(String texto) {
        //Remover acentos)
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", ""); // Remove acentos)

        //Remover não letras e converter para minúsculas
        String textoLimpo = textoNormalizado.replaceAll("[^a-zA-Z]", "").toLowerCase();

        //Verificar se é palíndromo
        int inicio = 0;
        int fim = textoLimpo.length() - 1;

        while (inicio < fim) {
            // Usando charAt como sugerido na dica
            if (textoLimpo.charAt(inicio) != textoLimpo.charAt(fim)) {
                return false; // Se encontrar caracteres diferentes, não é palíndromo
            }
            inicio++;
            fim--;
        }
        return true; // Se o loop terminar, é palíndromo
    }
}