package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class Poly extends JComponent implements KeyListener {

    int []x=new int[3];
    int []y = {100,150,200};
    


    public Poly(){
        x[0]=100;
        x[1]= 150;
        x[2]=125;
       setPreferredSize(new Dimension(400,400));
    }
    protected void paintComponent(Graphics g){

        super.paintComponent(g);    

        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 3);
    }



    public static void main(String[] args) {
        
        JFrame f = new JFrame("cirkelprogram");
        Poly c = new Poly();
        f.setLayout(new FlowLayout());
        f.setContentPane(c);
        f.setVisible(true);
        f.pack();
        f.addKeyListener(c);


    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==KeyEvent.VK_UP){

            System.out.println("up");

            for(int i=0; i<y.length;i++){

                y[i]=y[i]-1;

            }
            repaint();
        }


    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
