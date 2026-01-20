package objektOrientering;

public class Bil {

private int wheel;         // instansvariabler
private int seat;
private int växel;
private String märke;

static String serverip="200.200.200.200";  // klassvariabel medlemsvariabel


 public Bil(){

    this.wheel= 4;
    this.seat=5;
    this.växel=0;
    this.märke="volvo";

 }

 public Bil(String m){

    wheel=4;
    seat=5;
    växel=0;
    märke=m;

 }

public Bil(int v){

    wheel=4;
    seat=5;
    växel=v;
    märke="volvo";

 }


 public int getVäxel(){

 return this.växel;

 }




public static void main(String[] args) {
    

    Bil b1=new Bil();
    Bil b2=new Bil(9);

    System.out.println(b2.getVäxel());
    
     int vv=b1.getVäxel();

     System.out.println(vv);



    System.out.println(b2.serverip);


}







}
