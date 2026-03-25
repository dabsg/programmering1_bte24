
package grafik;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alarm {

    JLabel l1 = new JLabel();
    JFrame f= new JFrame("alarm");

    
public Alarm(){

    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formatted = now.format(formatter);

    System.out.println(formatted);


    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(new FlowLayout());
    f.add(l1);
    l1.setText(formatted);



   

}




    public static void main(String[] args) {
        new Alarm();
        java.awt.Toolkit.getDefaultToolkit().beep();  // sound



    }






}
