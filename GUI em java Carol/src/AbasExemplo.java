// exeercicio 8
import javax.swing.*;
import java.awt.*;

public class AbasExemplo  extends JFrame {
    public AbasExemplo() {
        super("Abas - JTabbedPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520,300);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Dados Pessoais"));
        p1.add(new JTextField("Nome", 10));

        JPanel p2 = new JPanel();
        p2.add(new JLabel("Endereço"));
        p2.add(new JTextField("Rua", 10));

        JPanel p3 = new JPanel();
        p3.add(new JLabel("Preferencias"));
        p3.add(new JCheckBox("Receber emails"));

        tabs.addTab("Pessoal", p1);
        tabs.addTab("Enderço", p2);
        tabs.addTab("Preferencias", p3);

        add(tabs);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AbasExemplo().setVisible(true));
    }
}
