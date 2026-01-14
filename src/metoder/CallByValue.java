package metoder;

public class CallByValue {

public static void main(String[] args) {
    int tal=100;
    changeTal(tal);
    System.out.println(tal);

}
public static void changeTal(int tal){

    tal++;

}

}
