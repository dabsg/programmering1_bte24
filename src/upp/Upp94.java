package upp;

public class Upp94 {

public static void main(String[] args) {
   
   char t=  tecken(-200);

   System.out.println(t);
}

static char tecken(double tal ){

    char tecken;

    if(tal <0){
        
        tecken='-';

    }else{

        tecken='+';
    }


    return tecken;

}


}
