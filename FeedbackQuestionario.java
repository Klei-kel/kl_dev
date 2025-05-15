import java.util.ArrayList;
import java.util.List;

public class FeedbackQuestionario {

    // Método para obter perguntas
    public static List<String> obterPerguntas() {
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
}
