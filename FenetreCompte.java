package fr.hoc.dap.Boutons;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FenetreCompte extends JFrame {

    private ComptePanel compte = new ComptePanel();

    /**
     * 
     */
    private static final long serialVersionUID = -6255837637028670939L;

    public FenetreCompte() {
        this.setTitle("Créer un nouveau compte");
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setLayout(new BorderLayout());

        this.getContentPane().add(compte, BorderLayout.CENTER);

        this.setVisible(true);
    }
    // Desktop.getDesktop().browse(new URI("http://localhost:8080/account/add/" + userKey));

    // class BoutonListener implements ActionListener {
    // public void actionPerformed(ActionEvent e) {

}
