package cobasendiri;
import java.util.*;

public class PerulanganFor1 {

    public static void main(String[] args) {
        /*
        Perulangan dibagi menjadi dua:
        1. Counted loop
        2. Uncounted loop

        * Counted loop itu seperti for dan dor each 
        * Uncounted loop itu seperti while dan do while
        */

        System.out.println("Perulangan For ");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Barisan Angka");

        System.out.println("Masukkan Angka Pertama: \n");
        int angkaAwal = userInput.nextInt();

        System.out.println("Masukkan Banyak Angka: \n");
        int banyakAngka = userInput.nextInt();

        System.out.println("Masukkan Beda Tiap Angka Pada Barisan: \n");
        int bedaAngka = userInput.nextInt();
        
        // Menutup Scanner nya
        userInput.close();

        int i;

        for (i = angkaAwal; i <= banyakAngka; i += bedaAngka){
            System.out.println(i + " ");
        }
        




    }
    
}
