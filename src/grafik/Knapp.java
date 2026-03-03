package grafik;


import java.awt.FlowLayout;

import javax.swing.*;


public class Knapp extends JFrame {

JButton  b1 = new JButton("click me");
JLabel textbox = new JLabel();
int i =0;

public Knapp(){

    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout());
    this.add(b1);
    this.add(textbox);
    b1.addActionListener(e->{

        textbox.setText("hej bte24");

    });


}
public static void main(String[] args) {
    new Knapp();
}




}
