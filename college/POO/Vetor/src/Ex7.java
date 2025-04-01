import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Parte A: Criptografar ---
        System.out.println("--- Criptografia (Cifra de César) ---");
        System.out.print("Digite o valor do deslocamento (k): ");
        int kCripto = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.print("Digite a mensagem para criptografar: ");
        String mensagemOriginal = scanner.nextLine();

        String mensagemCriptografada = cifrar(mensagemOriginal, kCripto);
        System.out.println("Mensagem Criptografada: " + mensagemCriptografada);
        System.out.println(); // Linha em branco para separar

        // --- Parte B: Descriptografar ---
        System.out.println("--- Descriptografia (Cifra de César) ---");
        System.out.print("Digite o valor do deslocamento (k) usado na criptografia: ");
        int kDecripto = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.print("Digite a mensagem para descriptografar: ");
        String mensagemCifrada = scanner.nextLine();

        String mensagemDescriptografada = decifrar(mensagemCifrada, kDecripto);
        System.out.println("Mensagem Descriptografada: " + mensagemDescriptografada);

        scanner.close();
    }

    //Método para criptografar
    public static String cifrar(String texto, int k) {
        StringBuilder textoCifrado = new StringBuilder();
        k = k % 26; // Garante que k esteja no intervalo do alfabeto

        for (char caractere : texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                // Calcula a nova posição com deslocamento k, de forma cíclica
                char novoCaractere = (char) (base + (caractere - base + k) % 26);
                textoCifrado.append(novoCaractere);
            } else {
                // Mantém caracteres que não são letras
                textoCifrado.append(caractere);
            }
        }
        return textoCifrado.toString();
    }

    //Método para descriptografar
    public static String decifrar(String textoCifrado, int k) {
        StringBuilder textoDecifrado = new StringBuilder();
        k = k % 26; // Garante que k esteja no intervalo do alfabeto

        for (char caractere : textoCifrado.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                // Calcula a posição original, deslocando -k, de forma cíclica
                // Adiciona 26 para garantir que o resultado do módulo seja positivo
                char novoCaractere = (char) (base + (caractere - base - k + 26) % 26);
                textoDecifrado.append(novoCaractere);
            } else {
                // Mantém caracteres que não são letras
                textoDecifrado.append(caractere);
            }
        }
        return textoDecifrado.toString();
    }
}