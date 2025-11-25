package loop;

public class Rik {

public static void main(String[] args) {
 
    
    int lön=1;
    int dag=0;
    int plånbok=0;

    while(plånbok<=1000000){
       
       
       plånbok=plånbok+lön;
        lön=lön*2;
        dag++;

    
    }

    System.out.println("dag nummer "+dag+"är förmögenheten "+plånbok);

}
}
