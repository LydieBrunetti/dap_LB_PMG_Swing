package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventPanel extends JPanel implements ActionListener {

    /**serialVersionUID. */
    private static final long serialVersionUID = -1021510070456132420L;

    //TODO lbpmg by Djer |POO| "nextEventlbl" serait plis claire
    private JLabel label2 = new JLabel("Prochain évènement :");
    //TODO lbpmg by Djer |POO| "errorlbl" serait plus claire
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
        //TODO lbpmg by Djer |POO| Une methode "updateLabels" (privée) pemetrait d'aviter de dupliquer se bout de code et 80% du ode du constructeur
        try {
            labelter.setText(Data
                    .getData("http://localhost:8080/event/nextString?userKey=" + DapData.getInstance().getUserKey()));
            labelter.setForeground(new Color(0, 0, 0));
        } catch (Exception e) {
            labelter.setText("error : impossible de récupérer les données");
            labelter.setForeground(new Color(255, 0, 0));
        }
    }
}
