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

    /**
     * 
     */
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

    public void actionPerformed(ActionEvent boutonok) {

        String nouveaunom = entree.getText();

        try {
            Desktop.getDesktop().browse(new URI("http://localhost:8080/account/add/" + nouveaunom));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            label.setText(entree.getText());
        } catch (URISyntaxException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

}
