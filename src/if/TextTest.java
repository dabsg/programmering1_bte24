public class TextTest {

    public static void main(String[] args) {
        
        String s1 = "daniel";
        String s2="Daniel";

        if(0==s1.compareToIgnoreCase(s2)){

            System.out.println("lika");
        }if(s1.compareToIgnoreCase(s2)<0){

            System.out.println("olika , s1 kommer före s2");

        }if(s1.compareTo(s2)>0){

            System.out.println("olika , s2 kommer före s1");

        }






    }
}
