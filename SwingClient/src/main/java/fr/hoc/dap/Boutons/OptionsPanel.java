package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionsPanel extends JPanel implements ActionListener {

    /**
     * 
     */
    private static final long serialVersionUID = -196996044686527386L;

    private JTextField entree2 = new JTextField("toto");
    private JLabel label2 = new JLabel("Saisissez votre UserKey :");
    private JButton boutonok = new JButton("Sauvegarder");

    public OptionsPanel() {
        Font police = new Font("Arial", Font.BOLD, 14);
        entree2.setFont(police);
        entree2.setPreferredSize(new Dimension(150, 40));
        entree2.setForeground(Color.BLACK);

        this.add(label2);
        this.add(entree2);
        this.add(boutonok);

        boutonok.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        DapData.getInstance().setUserKey(entree2.getText());
    }

}
