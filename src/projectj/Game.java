package projectj;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import java.awt.event.KeyListener;
import static javafx.scene.input.KeyCode.getKeyCode;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements KeyListener,ActionListener{
    private boolean play = false;
    private int score = 0;
    
    private int nbBricks = 7;
    
    private Timer time;
    private int speed=5;
    
    private int playerPosX=250;
    private int playerPosY=440;
    
    private int ballPosX=200;
    private int ballPosY=200;
    
    private int ballTrajX=-1;
    private int ballTrajY=-2;
    
    public Game(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(speed, this);
        time.start();
                
    }
    
    public void paint(Graphics g){
        //definir le fond en gris  foncé
        g.setColor(Color.darkGray);      
        g.fillRect(0,0,500,500);
        
        //definir des bordures
        g.setColor(Color.black);
        g.drawRect(0,0,490,465);
        g.drawRect(1,1,490,465);
        g.drawRect(2,2,490,465);
        g.drawRect(3,3,490,465);
        g.drawRect(4,4,490,465);
        
        //definir la ligne du fond
        g.setColor(Color.red);
        g.fillRect(0,460,500,20);
        
        //definir le curseur
        g.setColor(Color.white);
        g.fillRect(playerPosX,playerPosY,100,20);
        
        //definir la balle
        g.setColor(Color.green);
        g.fillOval(ballPosX,ballPosY,10,10);
        g.dispose();
        
    }
    public void actionPerformed(ActionEvent e) {
        time.start();
        
        if(play){
            ballPosX += ballTrajX;
            ballPosY += ballTrajY;
            if(ballPosX <0){
                ballTrajX = -ballTrajX;
            }
            if(ballPosY <0){
                ballTrajY = -ballTrajY;
            }
            if(ballPosX >465){
                ballTrajX = -ballTrajX;
            }
            if((ballPosY >= playerPosY-15 && ballPosY >= playerPosY)  && (ballPosX>=playerPosX && ballPosX<=playerPosX+100)){
                ballTrajY = -ballTrajY;
                score++;
            }
            if(ballPosY>= 460){
                play=false;
            }
            
        }
       
        repaint();
        System.out.println(score);
    }
    
    public void keyTyped(KeyEvent e) {
    }
    
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== 39){
            play=true;
            if(playerPosX >= 400){
                playerPosX = 400;
            }else{
            moveRight();
            }
        }
        if(e.getKeyCode()== 37){
            play=true;
            if(playerPosX <= 0){
                playerPosX = 0;
            }else{
            moveLeft();
            }
        }
    }
    public void moveRight(){
        playerPosX+=10;
    }
    public void moveLeft(){
        playerPosX-=10;
    }
    public void keyReleased(KeyEvent e) {
    }
    
}
