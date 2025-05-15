import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {

    public TelaLogin() {
        // Criar a janela de login
        JFrame frame = new JFrame("Login");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // CPF Label e Campo
        JLabel labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(50, 30, 80, 25);
        frame.add(labelCpf);

        JTextField textCpf = new JTextField();
        textCpf.setBounds(130, 30, 150, 25);
        frame.add(textCpf);

        // Senha Label e Campo
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 70, 80, 25);
        frame.add(labelSenha);

        JPasswordField textSenha = new JPasswordField();
        textSenha.setBounds(130, 70, 150, 25);
        frame.add(textSenha);

        // Botão de Login
        JButton buttonLogin = new JButton("Entrar");
        buttonLogin.setBounds(130, 110, 150, 25);
        frame.add(buttonLogin);

        // Ação do botão de login
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = textCpf.getText();
                String senha = new String(textSenha.getPassword());

                // Validação simples (substitua por validação em banco de dados)
                if (cpf.equals("12345678900") && senha.equals("senha123")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                    new TelaQuestionario(cpf); // Abre o questionário e passa o CPF
                    frame.dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(frame, "CPF ou senha inválidos.");
                }
            }
        });

        // Tornar visível
        frame.setVisible(true);
    }
}
