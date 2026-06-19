import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class SistemaSuporteTecnico extends JFrame {
    public SistemaSuporteTecnico() {
        setTitle("Sistema de Suporte Tecnico");
        setSize(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());
        JLabel lblMensagem = new JLabel("Seu problema foi resolvido?");
        JButton btnAcao = new JButton("Sim, fechar chamado");

        add(lblMensagem);
        add(btnAcao);

        btnAcao.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Chamado encerrado com sucesso!");
        });
    }

    public static void main(String[] args) {
        SistemaSuporteTecnico sistema = new SistemaSuporteTecnico();
        sistema.setVisible(true);
    }
    
}
