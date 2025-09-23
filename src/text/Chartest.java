package text;

import javax.swing.JOptionPane;

public class Chartest {

  public static void main(String[] args) {
    
    char c = 'A';

    System.out.println(c);

    char c1 ='\u9F8B';
    
    System.out.println(c1);
    JOptionPane.showMessageDialog(null, c1);

    char c2 = '\\';

    System.out.println("hej"+c2);

    char c3='A';

    int i= (int)c3;
    System.out.println(i);

    char c4 = (char)i;


  }  



}
