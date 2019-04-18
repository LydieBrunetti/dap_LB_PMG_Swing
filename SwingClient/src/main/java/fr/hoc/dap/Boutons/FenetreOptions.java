package fr.hoc.dap.Boutons;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FenetreOptions extends JFrame {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1260275529481795988L;
    
    private OptionsPanel options = new OptionsPanel();

    public FenetreOptions() {
        this.setTitle("Sélectionner un UserKey");
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setLayout(new BorderLayout());

        this.getContentPane().add(options, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
