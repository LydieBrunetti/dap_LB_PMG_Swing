/**
 * 
 */
package fr.hoc.dap.Boutons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * @author house
 *
 */
public class MenuPanel extends JPanel implements ActionListener {

    /** serialVersionUID.*/
    private static final long serialVersionUID = 6499696117685307207L;

    private Bouton refreshButon = new Bouton("Rafraichir");
    private Bouton optionbouton = new Bouton("Options");
    private Bouton comptebouton = new Bouton("Créer un compte");

    public MenuPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(refreshButon);
        this.add(optionbouton);
        this.add(comptebouton);
        this.setBackground(Color.GRAY);

        // refreshButon.addActionListener(this);
        optionbouton.addActionListener(this);
        comptebouton.addActionListener(this);
    }

    public void registerRefresh(ActionListener observateur) {
        refreshButon.addActionListener(observateur);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == comptebouton) {
          //TODO lbpmg by Djer |POO| Comme tu n'as pas besoin de l'instance de FenetreComtpe créée, tu n'est pas obligé de stocker cette instance dans une variable local
            FenetreCompte fen2 = new FenetreCompte();
        } else if (source == optionbouton) {
            //TODO lbpmg by Djer |POO| Comme tu n'as pas besoin de l'instance de FenetreOptions créée, tu n'est pas obligé de stocker cette instance dans une variable local
            FenetreOptions fen3 = new FenetreOptions();
        }
    }
}
