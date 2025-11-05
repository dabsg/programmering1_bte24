package arr;

import java.util.Scanner;

public class Biggest {

public static void main(String[] args) {
 
    //skapa array

    int[] i=new int[3];

    //scanner
    Scanner sc = new Scanner(System.in);

    // scanna in 
    System.out.println("ange ett tal");
    i[0]=sc.nextInt();
    System.out.println("ange ett tal");
    i[1]=sc.nextInt();
    System.out.println("ange ett tal");
    i[2]=sc.nextInt();

    int biggest=0;

    if(i[0] < i[1]){

        biggest=i[1];
        if(i[1]<i[2]){

            biggest=i[2];

        }
    }else{

        biggest=i[0];
        if(i[0]<i[2]){

            biggest=i[2];
        }

    }

    System.out.println("största talet är "+biggest);


    
    



}
}
