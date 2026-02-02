package metoder;

public class Bankomat {

 static int balance =0;



public static void main(String[] args) {
    
Bankomat.deposit(1000);

int b=Bankomat.balance();
System.out.println(b);


}


// insättning

public static void deposit(int amount){

    balance=balance+amount;


}

// uttag

public static void withdraw(){


}



// saldo

public static int balance(){

    return balance;
}




}
