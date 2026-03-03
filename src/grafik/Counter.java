package grafik;


import java.awt.FlowLayout;

import javax.swing.*;


public class Counter extends JFrame {

JButton  minus = new JButton("-");
JButton  plus = new JButton("+");
JLabel textbox = new JLabel("0");
int i =0;

public Counter(){

    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout());
    this.add(plus);
    this.add(minus);
    this.add(textbox);
    plus.addActionListener(e->{

        i++;
        textbox.setText(""+i);

    });


}
public static void main(String[] args) {
    new Counter();
}




}
