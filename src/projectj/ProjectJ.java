package projectj;

import javax.swing.SwingUtilities;

public class ProjectJ {
    public static void main(String[] args) {
        //opti Swing
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //Appel de la classe Frame avec en arg
                //le titre de la fenetre crée
                new Frame("Test ONE");
            }
        });  
    }
}
