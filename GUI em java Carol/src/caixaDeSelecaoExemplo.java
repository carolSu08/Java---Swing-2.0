// exemplo 6 ( caixa de selecao - JCheckBox )
// nao terminei
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class caixaDeSelecaoExemplo extends JFrame {
    public caixaDeCombinacaoExemplo(){
        super("Caixas de seleca - JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 180);
        setLocationRelativeTo(null);

        JCheckBox cbEmail = new JCheckBox("Receber emails");
        JCheckBox cbNotif = new JCheckBox("Ativar notificacoes");
        JCheckBox cbTermos = new JCheckBox("Aceito os termos");

        JLabel status = new JLabel("Selecione opções");

        ItemListener il = e -> status.setText(String.format("Emails:%s | Nootif: %s | Termos: %s",
                cbEmail.isSelected(), cbNotif.isSelected(), cbTermos.isSelected()));

    }
}
