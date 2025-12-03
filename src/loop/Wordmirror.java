package loop;

public class Wordmirror {
public static void main(String[] args) {
    
    String ord= "portugal";

    int längd =ord.length();

    String bakochfram="";

    for(int i =längd-1;i>=0;i-- ){


         bakochfram=bakochfram+ord.charAt(i);

    }

    System.out.println(bakochfram);



}
}
