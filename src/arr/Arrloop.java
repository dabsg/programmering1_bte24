package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arrloop {

    public static void main(String[] args) {
     
        Scanner sc =new Scanner(System.in);

        int[] number=new int[5];

        System.out.println("ange ett tal");
        number[0] = sc.nextInt();
        
        System.out.println("ange ett tal");
        number[1] = sc.nextInt();
        System.out.println("ange ett tal");
        
        number[2] = sc.nextInt();
        System.out.println("ange ett tal");
        
        number[3] = sc.nextInt();
        System.out.println("ange ett tal");
        number[4] = sc.nextInt();

        System.out.println(Arrays.toString(number));


    }
}
