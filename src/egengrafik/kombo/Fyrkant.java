package egengrafik.kombo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Fyrkant extends JComponent {


    private int x=0;

    public Fyrkant(){

        setPreferredSize(new Dimension(400,400));

    }
    @Override
    protected void paintComponent(Graphics g) {
        
        g.setColor(new Color(200, 255, 10));
        g.fillRect(x, 100, 40, 40);

        super.paintComponent(g);
    }
    public void changeX(){

        x++;
        repaint();
    }



}
