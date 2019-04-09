package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MailPanel extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = 2328643493016920959L;

    private JLabel label = new JLabel("Nombre d'emails non lus : ");
    private JLabel labelbis = new JLabel();

    public MailPanel() {
        try {
            labelbis.setText(
                    Data.getData("http://localhost:8080/email/nbunread?userKey=" + DapData.getInstance().getUserKey()));
            labelbis.setForeground(new Color(0, 0, 0));
        } catch (Exception e) {
            labelbis.setText("error : impossible de récupérer les données");
            labelbis.setForeground(new Color(255, 0, 0));
        }

        this.add(label);
        this.add(labelbis);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            labelbis.setText(
                    Data.getData("http://localhost:8080/email/nbunread?userKey=" + DapData.getInstance().getUserKey()));
            labelbis.setForeground(new Color(0, 0, 0));
        } catch (Exception e) {
            labelbis.setText("error : impossible de récupérer les données");
            labelbis.setForeground(new Color(255, 0, 0));
        }

    }

}
