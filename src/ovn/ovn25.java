package ovn;

import java.util.Scanner;

public class ovn25 {
public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);

    System.out.println("ange ditt för och efternamn");

    String helaNamnet=input.nextLine();

    String firsLetter=""+helaNamnet.charAt(0);

    int indexMellanslag= helaNamnet.indexOf(" ");


    String firstLetterSecondName=""+helaNamnet.charAt(indexMellanslag+1);

    System.out.println(firsLetter +" "+firstLetterSecondName);

}
}
