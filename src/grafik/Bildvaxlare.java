
package grafik;

import javax.swing.*;
import java.awt.*;

public class Bildvaxlare {

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

        l1.setIcon(new ImageIcon("bild2.jpg"));

    });
    
}
public static void main(String[] args) {
    new Bildvaxlare();
}




}
