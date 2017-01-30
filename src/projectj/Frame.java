package projectj;

import javax.swing.JFrame;

public class Frame extends JFrame{

    public Frame(String title){
        setTitle(title);
        //Fermeture du programme à la fermeture de la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //autoriser resize
        setResizable(true);
        setLocationRelativeTo(null);
        //Definir les dimensions de la fenetre(width, height)
        setSize(500, 500);
        //Rendre la fenetre visible
        setVisible(true);
        add(new Pannel());
    }
}
