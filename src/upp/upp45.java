package upp;

import java.util.Scanner;

public class upp45 {
public static void main(String[] args) {

//inläsning

Scanner sc = new Scanner(System.in);
System.out.println("ange ett tal");
String tal =sc.nextLine();

char täljare=  tal.charAt(0);
int täljare1 =Integer.parseInt(""+täljare);

char nämnare=  tal.charAt(2);
int nämnare1=Integer.parseInt(""+nämnare);

//beräkning

//5/3

int hela = täljare1/nämnare1;

int rest = täljare1%nämnare1;

System.out.println(rest);
//utskrift

System.out.println("hela: " +hela+ "  "+rest+"/"+nämnare1 );

}
}
