package grafik;
import java.awt.FlowLayout;

import javax.swing.*;


public class Text {
    JButton b1 = new JButton("send"); // instansvariabel
    JTextField t1 = new JTextField(20); // instansvariabel
    JFrame w = new JFrame();
public Text(String s){
    w.setVisible(true);
    w.setLayout(new FlowLayout());
    w.setSize(400, 400);
    w.add(t1);
    w.add(b1);
    b1.setText(s);
    b1.addActionListener(e->{
        String s1=t1.getText();
        System.out.println(s1);
        this.newText();
    });
}

public void newText(){

    w.setTitle("hejhejhejhejhejhej");

}

public static void main(String[] args) {
   
    Text t1=new Text("hej");
    

}



}
