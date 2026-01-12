package ovn;

import java.util.Arrays;

public class ovn84 {
public static void main(String[] args) {
  
int max=-1000000;    

int [] i ={5,5,7,8,3,2,8};

//Arrays.sort(i);
//System.out.println(Arrays.toString(i));

for(int k=0;k<i.length;k++){

     if( i[k] > max   ){

        max= i[k];
     }   


}

System.out.println(max);



}
}
