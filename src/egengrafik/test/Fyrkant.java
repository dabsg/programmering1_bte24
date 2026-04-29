package egengrafik.test;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class Fyrkant extends JComponent {

    int x=100;

    public Fyrkant(){

        setPreferredSize(new Dimension(400,400));

    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.fillRect(x, 100, 40, 40);
    }
    

    
    public void flytta() {
        
        x=x+5;
        repaint();
    }

}