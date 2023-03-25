import java.util.Scanner;
public class Main {
 /*    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("How high do you want the Pyramid tu be");
        int pyramid = sc.nextInt();
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
        int pyramidhight = scan.nextInt();
        System.out.println("With waht do you want bild:");
        String pramidstone = scan.next();
        scan.close();
        Pyramid (pyramidhight, piramidstone);
    } 
    public static void Pyramid (int pyramidhight, String pyramidstone){

        int pyramidstop = 1;
        String pyramidstart = pyramidstone;

        for (int i; i >= pyramidhight; pyramidhight++){
            System.printel.out (pyramidstone);
            pyramidstone = pyramidstone + pyramidstart;
            piramidhight--;
        }
    }
}
