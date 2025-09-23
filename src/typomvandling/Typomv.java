package typomvandling;

public class Typomv {

public static void main(String[] args) {


    int i = (int) 5.9;  // explecittypomvandling till int kapar decimaler

    String s= "6";

    i =Integer.parseInt(s); // sträng 6 till int 6

    String s1="3.5";

    double tal=Double.parseDouble(s1); // string 3.5 till dec tal 3.5

    int k=Integer.valueOf("333");  // sträng till int

    System.out.println("tal"+k);

}

}
