package text;

public class Text1 {

  public static void main(String[] args) {
    
   
    int tal1=5;
    int tal2=10;
    String s1 = "Daniel";
    String s2 = "Andersson";

    int svar = tal1+tal2;

    String s3 = s1+" "+s2+(tal1+tal2);
    System.out.println(s3);

        char tecken=s1.charAt(0);
        System.out.println(tecken);

        int längd=s1.length();
        System.out.println(längd);

        char tecken2=s1.charAt(längd-1);

        System.out.println(tecken2);

        String fågel=s2.substring(0,3);

      System.out.println(fågel);

  }

}
