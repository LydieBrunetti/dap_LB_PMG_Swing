package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComptePanel extends JPanel implements ActionListener {

    /** serialVersionUID. */
    private static final long serialVersionUID = 8525612752296251753L;

    private JTextField entree = new JTextField();
    private JLabel label = new JLabel("Saisissez votre nom :");
    private JButton boutonok = new JButton("OK");

    public ComptePanel() {
        Font police = new Font("Arial", Font.BOLD, 14);
        entree.setFont(police);
        entree.setPreferredSize(new Dimension(150, 40));
        entree.setForeground(Color.BLACK);

        this.add(label);
        this.add(entree);
        this.add(boutonok);
        
        boutonok.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        String nouveauNom = entree.getText();

        try {
            Desktop.getDesktop().browse(new URI("http://localhost:8080/account/add/" + nouveauNom));
        } catch (IOException e1) {
          //TODO lbpmg by Djer |POO| Tu peux supprimer ce TO-DO car il semble être traité
            // TODO Auto-generated catch block
          //TODO lbpmg by Djer |Log4J| "e1.printStackTrace()" affiche la trace directemnt dans la console est n'est "pas" visible. Une LOG (avec ajout des dépendance dans Maven pou Log4J) serait mieu
            e1.printStackTrace();
            label.setText(entree.getText());
        } catch (URISyntaxException e1) {
            // TODO Auto-generated catch block
            //TODO lbpmg by Djer |Log4J| "e1.printStackTrace()" affiche la trace directemnt dans la console, une LOG serait mieu
            e1.printStackTrace();
        }
    }
}
