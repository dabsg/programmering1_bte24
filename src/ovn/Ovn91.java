package ovn;

import java.util.Scanner;

public class Ovn91 {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("ange radie");
     double r =sc.nextDouble();
     cylinderArea(r);
}

private static void cylinderArea(double r){

    double area= Math.PI*Math.pow(r, 2);
    System.out.println(area);


}








}
