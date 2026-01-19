package metoder;

import java.util.Arrays;

public class CallByRef {

    public static void main(String[] args) {
    
        
        String [] ord =new String[6];
        ord[0]="hund";
        ord[1]="är";
        ord[2]="snäll";
        ord[3]="kniv";
        ord[4]="katt";
        ord[5]="när";

        System.out.println(Arrays.toString(ord));
        slumpaMening(ord);
        System.out.println(Arrays.toString(ord));
    }

    public static void slumpaMening(String[] o){

        String mening="";

        for(int i=0; i<o.length;i++){

            int slumpPos=(int) (Math.random()*6 );
            //System.out.print("slump"+slumpPos);

             mening =mening +" "+ o[slumpPos];


        }
        o[0]="tom";
        System.out.println(mening);
    }




}
