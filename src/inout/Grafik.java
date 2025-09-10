package inout;

import javax.swing.JOptionPane;

public class Grafik {
public static void main(String[] args) {
 
    String stal=JOptionPane.showInputDialog("ange ett tal");
    
    int tal =Integer.parseInt(stal);

    tal = tal*tal;

    JOptionPane.showMessageDialog(null,"svar"+tal);

}
}
