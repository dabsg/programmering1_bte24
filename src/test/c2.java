package test;

import javax.swing.*;
import java.awt.*;


public class c2 extends JComponent{
public static void main(String[] args) {
    
    JFrame jf=new JFrame();
    jf.setLayout(new FlowLayout());
    
    jf.add(new c2());
jf.setVisible(true);
}


    Color color1;
    Color color2; 
    
    public c2(){
setPreferredSize(new Dimension(500, 500));
    color1 = Color.BLACK;
    color2 = Color.BLACK;
    Timer t=new Timer(500, e->{
            color1=Color.BLACK;
            color2=Color.red;


    });
    Timer n=new Timer(1000, e->{
          color1=Color.red;
          color2=Color.black;
    });
}



@Override
protected void paintComponent(Graphics g){
    int[] xPoint={100,300,200,};
    int[] yPoint={100,100,300,};
    g.drawPolygon(xPoint, yPoint, 3);
    g.setColor(color1);
    g.drawOval(300, 40, 20, 20);

    g.setColor(color2);
    g.drawOval(400, 40, 20, 20);
    
}

    }
