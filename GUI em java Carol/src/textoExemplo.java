// exemplo 3 ( texto - rotulos, html basico) //

import javax.swing.*;
import java.awt.*;

public class textoExemplo extends JFrame {

    public textoExemplo() {
        super("Texto - JLabel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 220);
        setLocationRelativeTo(null);

        JLabel puro = new JLabel ("Texto simples com JLabel");
        JLabel html = new JLabel("<html><h3>Texto com<i>HTML</i></h3><p>Você pode<b>formatar</b> minimamente.</p></html>");
        puro.setHorizontalAlignment((SwingConstants.CENTER));
        html.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new GridLayout(2,1));
        add(puro);
        add(html);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new textoExemplo().setVisible(true));
    }

}
