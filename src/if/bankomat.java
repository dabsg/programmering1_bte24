import java.util.Scanner;

public class bankomat {
public static void main(String[] args) {
System.out.println("\n\n ");    

Scanner sc = new Scanner(System.in);
int val =1;
int saldo = 1000;

while(val>0 || val<5){

System.out.println("1:uttag 2:insättning 3:saldo 4:dö");
 val = sc.nextInt();        



switch (val) {
    case 1:
        System.out.println("uttag");
        break;

    case 2:
        System.out.println("insättning");
        break;
    case 3:
        System.out.println("ditt saldo är "+ saldo);
        break;

    default:
        System.out.println("tack för idag");
        System.exit(0);
        break;
}

}




}
}
