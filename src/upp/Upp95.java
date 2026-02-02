package upp;

public class Upp95 {

public static void main(String[] args) {
    
// for(int i =30; i<66; i++){

// char t =(char) i;

// System.out.println("pos"+i+" tecken :"+t);


System.out.println(""+siffra('A'));

}


static boolean siffra(char tecken){

int i =tecken;
if(i<=57 && i>=48){

    return true;

}else{
    return false;
}

}



}



