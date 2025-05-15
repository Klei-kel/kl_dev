import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeedbackQuestionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Questionário de Feedback ===\n");

        // Obter perguntas
        List<String> perguntas = obterPerguntas();

        // Coletar respostas
        List<String> respostas = coletarRespostas(scanner, perguntas);

        // Exibir relatório final
        exibirRelatorio(perguntas, respostas);

        scanner.close();
    }

    private static List<String> obterPerguntas() {
        List<String> perguntas = new ArrayList<>();
        perguntas.add("1. Como você avalia o ambiente de trabalho? (1 a 5)");
        perguntas.add("2. A comunicação com a equipe está satisfatória? (sim/não)");
        perguntas.add("3. O que você mudaria na empresa?");
        perguntas.add("4. Você recomendaria a empresa para um amigo? (sim/não)");
        perguntas.add("5. Como você avalia o equilíbrio entre vida pessoal e profissional? (1 a 5)");
        perguntas.add("6. Você se sente valorizado na empresa? (sim/não)");
        perguntas.add("7. Se não se sente valorizado, o que poderia ser feito para melhorar?");
        perguntas.add("8. O que você mais gosta na empresa?");
        perguntas.add("9. O que você menos gosta na empresa?");
        perguntas.add("10. Você tem sugestões para melhorar o ambiente de trabalho?");
        perguntas.add("11. Você gostaria de adicionar mais alguma coisa?");
        return perguntas;
    }

    private static List<String> coletarRespostas(Scanner scanner, List<String> perguntas) {
        List<String> respostas = new ArrayList<>();
        for (String pergunta : perguntas) {
            String resposta;
            do {
                System.out.println(pergunta);
                System.out.print("Resposta: ");
                resposta = scanner.nextLine();
            } while (!validarResposta(pergunta, resposta));
            respostas.add(resposta);
            System.out.println();
        }
        return respostas;
    }

    private static boolean validarResposta(String pergunta, String resposta) {
        if (pergunta.contains("(1 a 5)")) {
            try {
                int valor = Integer.parseInt(resposta);
                return valor >= 1 && valor <= 5;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número entre 1 e 5.");
                return false;
            }
        } else if (pergunta.contains("(sim/não)")) {
            if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")) {
                System.out.println("Por favor, responda com 'sim' ou 'não'.");
                return false;
            }
        }
        return true;
    }

    private static void exibirRelatorio(List<String> perguntas, List<String> respostas) {
        System.out.println("\n=== Resumo do Feedback ===");
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            System.out.println("Resposta: " + respostas.get(i));
            System.out.println();
        }
        System.out.println("Obrigado por participar do feedback!");
    }
}