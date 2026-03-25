package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class Cirkel extends JComponent {

    public Cirkel(){
       setPreferredSize(new Dimension(400,400));
    }
    protected void paintComponent(Graphics g){

        super.paintComponent(g);    

        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 50, 50);
        g.setColor(new Color(255, 100, 100));
        g.fillOval(150, 150, 50, 50);
    }



    public static void main(String[] args) {
        
        JFrame f = new JFrame("cirkelprogram");
        Cirkel c = new Cirkel();
        f.setLayout(new FlowLayout());
        f.setContentPane(c);
        f.setVisible(true);
        f.pack();


    }

}
