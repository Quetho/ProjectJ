package projectj;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pannel extends JPanel{
    
    private static final long serialVersionUID = 1L;
    
    public Pannel(){
        //initialiser les composants
        //boutton avec arg : texte du boutton
        JButton button = new JButton("Connect !");
        //label avec arg : texte du label
        JLabel nick = new JLabel("Nickname");
        JLabel pass = new JLabel("Password");
        //zone de text/password avec arg : taille de la zone de texte
        JTextField textfield = new JTextField(10);
        JPasswordField passwordfield = new JPasswordField(10);
        //menu Select. peut prendre en argument un tableau
        JComboBox<String> menuSelect = new JComboBox<String>();
        menuSelect.addItem("salut");
        menuSelect.addItem("C'est");
        menuSelect.addItem("Cool");

        //afficher les composants
        add(button);
        add(nick);
        add(textfield);
        add(pass);
        add(passwordfield);
        add(menuSelect);
    }
    
    
    /*
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
            //Chargement de l'image et enregistrement dans la mémoire
            Image image = ImageIO.read(new File("src/projectj/images/A.png"));
            //Afficher l'image chargée precedement.
            g.drawImage(image,0,0,getWidth(), getHeight(),this);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        ///Utilisation de g2D, affichage d'un dégradé
        Graphics2D g2D = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0,0,Color.BLUE,100,200,Color.GREEN);
        g2D.setPaint(gradient);
        g2D.fillRect(0,0,getWidth(),getHeight());
    }
*/
    
    
    
    
}
