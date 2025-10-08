// exemplo 5 ( Caixa de combinação - JComboBox )

import javax.swing.*;
import java.awt.*;

public class caixaDeCombinacaoExemplo extends JFrame{
    public caixaDeCombinacaoExemplo() {
        super("Caixa de combinação - JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 160);
        setLocationRelativeTo(null);

        String[] cursos = {"Java", "Python", "C#", "JavaScript"};
        JComboBox<String> combo = new JComboBox<>(cursos);
        combo.setEditable(true);

        JLabel sel = new JLabel("Selecionado: "+ combo.getSelectedItem());

        combo.addActionListener(e -> sel.setText("Selecionando: "+ combo.getSelectedItem()));

        JPanel p = new JPanel();
        p.add(new JLabel("Curso:"));
        p.add(combo);
        p.add(sel);
        add(p);
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(() -> new caixaDeCombinacaoExemplo().setVisible(true));
    }
}
