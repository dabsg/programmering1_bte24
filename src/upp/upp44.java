package upp;

import java.util.Scanner;

public class upp44 {
public static void main(String[] args) {
    
//inläsning

Scanner sc = new Scanner(System.in);
System.out.println("ange ett tal");
int tal =sc.nextInt();

//avrundning

int tal1= tal+500;  // 77060

double tal2= tal1/1000.0; // 77,060


int tal3 = (int) tal2; // 77

int tal4= tal3*1000;



//utskrift

System.out.println("talet blir avrundat: "+tal4+" kr");

}
}
