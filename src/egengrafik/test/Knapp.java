package egengrafik.test;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Knapp {

JFrame f = new JFrame();    
JButton b = new JButton("move");
Fyrkant fyr= new Fyrkant();

public Knapp(){

f.setVisible(true);
f.setSize(700,700);
f.setLayout(new FlowLayout());
f.add(b);
f.add(fyr);
b.addActionListener(e->{
fyr.flytta();
//f.requestFocusInWindow();
});
//f.requestFocusInWindow();
fyr.setFocusable(true);
fyr.requestFocusInWindow();
b.setFocusable(false);

fyr.addKeyListener(new KeyAdapter(){

      public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode()==KeyEvent.VK_UP ){

            fyr.flytta();
        }
    }

});


}


public static void main(String[] args) {
    new Knapp();
}

}
