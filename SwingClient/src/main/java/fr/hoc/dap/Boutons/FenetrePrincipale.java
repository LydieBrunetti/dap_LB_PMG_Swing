package fr.hoc.dap.Boutons;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetrePrincipale extends JFrame {

    /** serialVersionUID. */
    private static final long serialVersionUID = 82608271135446665L;

    private MailPanel email = new MailPanel();
    private EventPanel event = new EventPanel();
    private MenuPanel menu = new MenuPanel();
    
    //TODO lbpmg by Djer |POO| Pas top comme nom "EastPadding" serait mieux
    private JPanel pan4 = new JPanel();

    //TODO lbpmg by Djer |Swing| Il faut eviter d'utiliser un Label pour faire "de la mise en page". SI **vraiment** nécésaire il vaut mieux créer un "Layout" spécifique (un "balancedBorderLayout" qui s'occupe d'aquillibrer l'afifchage SI une zone est vide) mais cela sera assez complexe 
    private JLabel label3 = new JLabel("                                       ");

    public FenetrePrincipale() {
        this.setTitle("Super Application");
        this.setSize(800, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu.registerRefresh(email);
        menu.registerRefresh(event);

        pan4.setBackground(Color.GRAY);
        pan4.add(label3);

        this.setLayout(new BorderLayout());

        this.getContentPane().add(email, BorderLayout.CENTER);

        // this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);

        this.getContentPane().add(event, BorderLayout.SOUTH);

        this.getContentPane().add(menu, BorderLayout.WEST);

        this.getContentPane().add(pan4, BorderLayout.EAST);

        this.setVisible(true);
    }
}
