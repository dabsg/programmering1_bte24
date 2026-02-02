package metoder;

import loop.For;

public class Stars {
    public static void main(String[] args) {
        

    box(10,10);

    }

    private static void box(int x, int y) {
        
        for(int i=0; i<y; i++){

            for(int j=0; j<x; j++){

                    System.out.print("*");
            }
            System.out.println("");

        }



    }
}
