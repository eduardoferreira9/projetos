import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe para representar uma disciplina e suas médias
class Disciplina {
    String nome;
    double[] mediasBimestrais = new double[4];
    double mediaAnual;
    String status;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void calcularMediaAnual() {
        double soma = 0;
        for (double media : mediasBimestrais) {
            soma += media;
        }
        this.mediaAnual = soma / 4.0;
        this.status = (this.mediaAnual >= 7.0) ? "(Aprovado)" : "(Reprovado)";
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Disciplina> disciplinas = new ArrayList<>();
        double maiorMediaGeral = Double.MIN_VALUE; // Inicializa com o menor valor possível
        double menorMediaGeral = Double.MAX_VALUE; // Inicializa com o maior valor possível

        System.out.println("--- Registro de Médias Bimestrais ---");
        System.out.println("Digite o nome da disciplina ou '-1' para finalizar.");

        while (true) {
            System.out.print("\nNome da Disciplina: ");
            String nomeDisciplina = scanner.nextLine();

            if (nomeDisciplina.equals("-1")) {
                break; // Finaliza a inserção
            }

            Disciplina novaDisciplina = new Disciplina(nomeDisciplina);

            System.out.println("Digite as médias dos 4 bimestres para " + nomeDisciplina + ":");
            for (int i = 0; i < 4; i++) {
                System.out.printf("Média Bimestre %d: ", i + 1);
                // Validação básica de entrada (pode ser mais robusta)
                while (!scanner.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next(); // descarta a entrada inválida
                    System.out.printf("Média Bimestre %d: ", i + 1);
                }
                novaDisciplina.mediasBimestrais[i] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consumir a nova linha

            novaDisciplina.calcularMediaAnual();
            disciplinas.add(novaDisciplina);

            // Atualiza maior e menor média geral
            if (novaDisciplina.mediaAnual > maiorMediaGeral) {
                maiorMediaGeral = novaDisciplina.mediaAnual;
            }
            if (novaDisciplina.mediaAnual < menorMediaGeral) {
                menorMediaGeral = novaDisciplina.mediaAnual;
            }
        }

        System.out.println("\n--- Resultados Finais ---");
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina foi registrada.");
        } else {
            for (Disciplina d : disciplinas) {
                System.out.printf("%s - Média Anual: %.1f %s\n",
                        d.nome, d.mediaAnual, d.status);
            }
            System.out.printf("\nMaior média geral entre as disciplinas: %.1f\n", maiorMediaGeral);
            System.out.printf("Menor média geral entre as disciplinas: %.1f\n", menorMediaGeral);
        }

        scanner.close();
    }
}