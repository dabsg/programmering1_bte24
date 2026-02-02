package objektOrientering;

public class Konto {


    private int saldo=0;
    private int kontoNummer;

    static double ränta =1.05;

    public Konto(int s,int k){

        this.saldo=s;
        this.kontoNummer=k;

        System.out.println("du har skapat konto " +kontoNummer+"med saldot " +saldo);

    }

    public void årsRänta(){

        this.saldo = (int)(saldo*ränta);


    }

    public int getSaldo(){

        return saldo;
    }


    public static void main(String[] args) {
        
       Konto k1=new Konto(10000000, 1);
       
       k1.årsRänta();

       System.out.println(""+k1.getSaldo());




    }
    




}
