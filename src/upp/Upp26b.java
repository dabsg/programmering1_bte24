package upp;

import java.util.Scanner;

public class Upp26b {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("hur mycket pengar vill du ta ut");
        int cash=input.nextInt();

        double cash1 =(int) ((cash/100.0)+0.99);        // 11.36  // 12.35
 
        int product=(int)(cash1*100);

            int femhundra=product/500;
            int femhundraRest=product%500;
            int hundra=femhundraRest/100;
            

        System.out.println("du får " + femhundra+"st 500 sedlar "+hundra+" st hundrasedlar" );


    }



}
