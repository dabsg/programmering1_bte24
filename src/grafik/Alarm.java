
package grafik;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alarm {

    
public Alarm(){
LocalDateTime now = LocalDateTime.now();

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
String formatted = now.format(formatter);

System.out.println(formatted);
   

}




    public static void main(String[] args) {
        new Alarm();
        java.awt.Toolkit.getDefaultToolkit().beep();  // sound



    }






}
