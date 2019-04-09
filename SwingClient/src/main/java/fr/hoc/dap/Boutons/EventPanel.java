package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventPanel extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = -1021510070456132420L;

    private JLabel label2 = new JLabel("Prochain évènement :");
    private JLabel labelter = new JLabel();

    public EventPanel() {
        try {
            labelter.setText(Data
                    .getData("http://localhost:8080/event/nextString?userKey=" + DapData.getInstance().getUserKey()));
            labelter.setForeground(new Color(0, 0, 0));
        } catch (Exception e) {
            labelter.setText("error : impossible de récupérer les données");
            labelter.setForeground(new Color(255, 0, 0));
        }

        this.add(label2);
        this.add(labelter);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            labelter.setText(Data
                    .getData("http://localhost:8080/event/nextString?userKey=" + DapData.getInstance().getUserKey()));
            labelter.setForeground(new Color(0, 0, 0));
        } catch (Exception e) {
            labelter.setText("error : impossible de récupérer les données");
            labelter.setForeground(new Color(255, 0, 0));
        }
        // TODO Auto-generated method stub

    }
}
