package Pyramide;
import java.util.Scanner;
public class Main {

 /*    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("How high do you want the Pyramid tu be");
     6   int pyramid = sc.nextInt();
        sc.close();
        pyramide(pyramid);
    }  

     public static void pyramide (int pyramid) {
        
         String stern = ("*");

         do {
            System.out.println (stern);
            pyramid--;
            stern = stern + "*";
         }
        while (pyramid >= 1);
    }
    
} */
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("How high do you want the Pyramid to be:");
        int pyramidHight = scan.nextInt();
        System.out.println("With waht do you want bild:");
        String pyramidStone = scan.next();
        scan.close();
        pyramid (pyramidHight, pyramidStone);
    } 
    public static void pyramid (int pyramidHight, String pyramidStone){
        System.out.println();
        String pyramidNeu = "";

        for (int i = 0; i < pyramidHight; i++){            
            pyramidNeu = pyramidNeu + pyramidStone;
            System.out.println(pyramidNeu);
        }
    }
}
