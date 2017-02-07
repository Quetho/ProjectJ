package projectj;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Pannel extends JPanel{
    
    private static final long serialVersionUID = 1L;
    public static int count = 0;

    public Pannel(){
        //initialiser les composants
        //boutton avec arg : texte du boutton
        JButton button = new JButton("Connect !");
        //label avec arg : texte du label
        JLabel nick = new JLabel("Nickname");
        JLabel pass = new JLabel("Password");
        //zone de text/password avec arg : taille de la zone de texte
        JTextField textfield = new JTextField(10);
        JTextArea textarea = new JTextArea(2,8);
        JPasswordField passwordfield = new JPasswordField(10);
        //menu Select. peut prendre en argument un tableau
        JComboBox<String> menuSelect = new JComboBox<String>();
        menuSelect.addItem("salut");
        menuSelect.addItem("C'est");
        menuSelect.addItem("Cool");

        
        //evenement
        button.addActionListener(new ActionListener() {
            //a chaque click sur le boutton, rajoute une ligne dans le text area
            public void actionPerformed(ActionEvent e) {
                count++;
                textarea.append("olala ca marche"+count+"fois\n");
                
            }      
        });
        //si on click droit sur nickname, affiche du text dans la console
        nick.addMouseListener(new MouseListener(){
            
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                    System.out.println("rightclick on nick mgl");
                }
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) { 
            }
            public void mouseEntered(MouseEvent e) {   
            }
            public void mouseExited(MouseEvent e) {             
            }
            
        });
        //les lettres tappées dans le nicknae sont envoyée à la console
        textfield.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
            //affiche le keycode dans la console si curseur actif dans le nickname
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

            }
            public void keyReleased(KeyEvent e) {
            }
        });
        
        menuSelect.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                System.out.println("item selectionné changé");
            }
            
        });
        //afficher les composants
        
        add(button);
        add(nick);
        add(textfield);
        add(pass);
        add(passwordfield);
        add(menuSelect);
        //ajout zone de texte avec barre de defilement
        add(new JScrollPane(textarea));
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
