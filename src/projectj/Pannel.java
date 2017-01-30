package projectj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pannel extends JPanel{
    
    private static final long serialVersionUID = 1L;
    
    public void paintComponent(Graphics g){
        //definir la couleur d'affichage
        
        //definir couleur de fond
        g.setColor(Color.BLACK);
        //Avec arg : posX, posY, dimX, dimY
        g.fillRect(0, 0, getWidth(), getHeight());
        
        //afficher hello world en position 250x250
        Font font = new Font("Arial", Font.BOLD,40);
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("Test",100,100);
        
        try {
            Image image = ImageIO.read(new File("src/projectj/images/A.png"));
            g.drawImage(image,100,100,this);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
