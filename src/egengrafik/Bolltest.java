package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class Bolltest extends JComponent{

    private Timer t;
    Boll b1= new Boll();

    public Bolltest(){

        setPreferredSize(new Dimension(500,500));

        t= new Timer(30, e->{

            update();
            repaint();

        });

        t.start();

    }

    public void update(){
       
        b1.update();
    }


    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(b1.getX(), b1.getY(), 50, 50);
    }

    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setVisible(true);
        f.add(new Bolltest());
        f.pack();


    }
}
