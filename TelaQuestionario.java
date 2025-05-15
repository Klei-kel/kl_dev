import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaQuestionario {

    public TelaQuestionario(String cpf) {
        // Criar a janela do questionário
        JFrame frame = new JFrame("Questionário de Feedback");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(12, 1)); // Layout para organizar perguntas

        // Obter as perguntas do FeedbackQuestionario
        List<String> perguntas = FeedbackQuestionario.obterPerguntas();
        JTextField[] respostas = new JTextField[perguntas.size()];

        // Adicionar perguntas e campos de texto
        for (int i = 0; i < perguntas.size(); i++) {
            frame.add(new JLabel(perguntas.get(i)));
            respostas[i] = new JTextField();
            frame.add(respostas[i]);
        }

        // Botão para finalizar
        JButton buttonFinalizar = new JButton("Finalizar");
        buttonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resumo = new StringBuilder();
                resumo.append("CPF: ").append(cpf).append("\n");
                for (int i = 0; i < perguntas.size(); i++) {
                    resumo.append(perguntas.get(i)).append("\nResposta: ").append(respostas[i].getText()).append("\n\n");
                }
                JOptionPane.showMessageDialog(frame, "Obrigado pelo feedback!\n\n" + resumo.toString());
                frame.dispose(); // Fecha a janela após finalizar
            }
        });
        frame.add(buttonFinalizar);

        // Tornar visível
        frame.setVisible(true);
    }
}
