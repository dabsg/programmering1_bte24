package inout;

import java.util.Scanner;

public class Inread {

public static void main(String[] args) {
 
    Scanner sc =new Scanner(System.in);

    System.out.println("ange ett djur");
    
     String djur=sc.nextLine();

    System.out.println("djurets vikt");

    int vikt=sc.nextInt();

     vikt = vikt * vikt;


    System.out.println("du gillar "+djur+" som väger "+vikt+"kg");

}
}
