package fr.hoc.dap.Boutons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

//TODO lbpmg by Djer |Swing| Il n'est pas utile que cette classe implemente "ActionListener". Les autres classes utilisant celle-ci peuvent gérer eelle-même écouter des actions (et s'enregistrer auprès de ce bouton via la méthode "addActionListener" déja définie dans le parent (JButton)) 
public class Bouton extends JButton implements MouseListener {

    /** serialVersionUID. */
    private static final long serialVersionUID = -3582481046378898454L;

    private String name;

    public Bouton(String str) {
        super(str);
        this.name = str;
        this.setSize(20, 20);

        this.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
