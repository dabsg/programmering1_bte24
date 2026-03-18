package objektOrientering;

public class Hiss {

private int våning ;  // instansvariabel , modifierar private public ingen protected
private int riktning; // instansvariabel,

public Hiss(int v ,int r){

this.våning = v;
this.riktning=r;

}
public int getVåning(){


    return våning;

}

public void moveToFloor(int våning){

if(våning >0 && våning <10){    
    this.våning = våning;
}else{
    System.out.println("felvåning");
}


}





}
