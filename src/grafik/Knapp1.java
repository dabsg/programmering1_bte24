package grafik;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Knapp1 extends JFrame implements ActionListener {

JButton  b1 = new JButton("click me");
JLabel textbox = new JLabel();


public Knapp1(){

    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout());
    this.add(b1);
    this.add(textbox);
    b1.addActionListener(this);
}

public static void main(String[] args) {
    new Knapp1();
}

@Override
public void actionPerformed(ActionEvent e) {
  
    if(e.getSource()==b1){
    textbox.setText("hej");
    }

}




}
