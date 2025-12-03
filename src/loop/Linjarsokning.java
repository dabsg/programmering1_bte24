package loop;

import java.util.Arrays;

public class Linjarsokning {
public static void main(String[] args) {
  
 


int []i =new int [6]; 

for(int k=0;k<=5;k++){

i[k]= (int)(Math.random()*10);

}

int sökt=7;
boolean finns=false;

for(int g=0;g<i.length;g++){

    if(i[g]==sökt){
        finns=true;
        
        System.out.println("talet"+ sökt+"finns på plats"+g);
        break;
    }

}
if(!finns){ 
System.out.println("talet finns ej");
}


System.out.println(Arrays.toString(i));


}
}
