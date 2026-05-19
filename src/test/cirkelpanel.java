package test;
import java.awt.*;
import javax.swing.*;

public class cirkelpanel extends  JPanel{

    public cirkelpanel(){

        setPreferredSize(new Dimension(400,400));
    }
    
    int randomx= (int)(Math.random()*100);

    @Override
    protected  void paintComponent(Graphics graph){
        super.paintComponent(graph);
        graph.setColor(Color.BLUE);
        graph.fillOval(200+randomx, 300+randomx, 200, 200);
        graph.setColor(Color.green);
        graph.fillRect(400+randomx, 300+randomx, 40, 40);
         graph.fillRect(200, 200, 40, 40);
         System.out.println(randomx);
    }   

}
