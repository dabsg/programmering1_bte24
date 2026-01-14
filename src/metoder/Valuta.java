package metoder;

public class Valuta {

public static void main(String[] args) {
    
//100
double nok=sekYen(100);
System.out.println(nok);



}


public static double sekNok(int sek){

double nok =sek*1.09;

return nok;
}
public static double sekYen(int sek){

double yen=sek*0.76;
return yen;

}

}
