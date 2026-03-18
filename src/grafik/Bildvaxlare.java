
package grafik;

import javax.swing.*;
import java.awt.*;

public class Bildvaxlare {
boolean bild=true;
JFrame f = new JFrame();   // instansvariabler 
JButton b1= new JButton("bytbild");
JLabel l1 = new JLabel(new ImageIcon("bild1.jpg"));

public Bildvaxlare(){

    f.setLayout(new FlowLayout());
    f.setSize(new Dimension(800,800));
    f.setVisible(true);
    f.add(l1);
    f.add(b1);
    b1.addActionListener(e->{

        if(bild==true){
        System.out.print(l1.getIcon());    
        l1.setIcon(new ImageIcon("bild2.jpg"));
        bild=false;
        }else{
            l1.setIcon(new ImageIcon("bild1.jpg"));
        bild=true;

        }




    });
    
}
public static void main(String[] args) {
    new Bildvaxlare();
}




}
