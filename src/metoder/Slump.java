package metoder;

import java.util.Arrays;

public class Slump {

public static void main(String[] args) {
    


    int [] tal = new int[50];
    arrSlump(tal);

    System.out.println(Arrays.toString(tal));


}

static void arrSlump(int[] tal) {
    
    for (int i=0; i<tal.length;i++) {

        tal[i]=(int) ((Math.random()*10)+1);
        
    }



}

}
