package test;

import java.awt.*;
import javax.swing.*;

public class huvud {
   
   
    cirkelpanel cirkel = new cirkelpanel();
    
    int randomx;
      
       
  
        public huvud(){

        randomx= (int)(Math.random()*100);
        JFrame frame = new JFrame();
        JButton buttonC = new JButton("Cirkel");
        JButton buttonK = new JButton("Kvadrat");
        
       
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new FlowLayout());
        frame.add(cirkel);
       
        frame.add(buttonC);
        frame.add(buttonK);
        
        // buttonC.addActionListener(e-> {
            
            
        // });
        // buttonK.addActionListener(e-> {
        // });
        frame.setVisible(true);
        
    }   

        
    public static void main(String[] args) {
        new huvud();
    }
}
