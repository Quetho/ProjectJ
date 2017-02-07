
package projectj;

import javax.swing.JFrame;

public class ProjectJ {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        Game game = new Game();
        window.setBounds(200,100,500,500);
        window.setTitle("Bricker");
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(game);
        
    }
    
}
