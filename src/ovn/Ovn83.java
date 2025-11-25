package ovn;

public class Ovn83 {
public static void main(String[] args) {
    
    int[] hastighet=new int[8];
int[] hastighet2=new int[8];

    System.out.println("m/s\tkm/h");

for(int i=0;i<8; i+=1){

    hastighet[i]=5*(i+1);
    hastighet2[i]=(int)(5*(i+1)*3.6);

     System.out.println(hastighet[i]+"\t"+hastighet2[i]);

}


}
}
