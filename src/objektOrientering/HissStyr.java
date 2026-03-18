package objektOrientering;

public class HissStyr {


    public HissStyr(){

        Hiss h1 = new Hiss(0,0);  // skapar ny instans/objekt av hiss klassen, skickar 2st inparametrar till konstruktorn, deklarerar en hiss variabel kallad referensvariabel heter h1 lagrar referens till instans/objekt
        System.out.println(h1.getVåning()); // hämtar våning via instansmetod skriver ut våning
        h1.moveToFloor(-30000000); //
        System.out.println(h1.getVåning());
    }




public static void main(String[] args) {
    
new HissStyr();

}

}
