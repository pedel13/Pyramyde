package Pyramide;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
    
}
