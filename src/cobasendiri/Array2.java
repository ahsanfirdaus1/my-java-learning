package cobasendiri;
import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        //  Define Scanner dahulu 
        Scanner userInput = new Scanner(System.in);

        try {
    
            // Intro 
            System.out.println("Program Input Daftar Mobil");
    
            System.out.println("Jumlah Mobil yang Ingin Diinput: \n");
            int jumlahMobil = userInput.nextInt();
    
            //  Pendeklarasian array nama mobil 
            String[] namaMobil = new String[jumlahMobil];
            
            // Memulai Proses Penginputan dengan looping for
            for(jumlahMobil = 0; jumlahMobil < namaMobil.length; jumlahMobil++){
                System.out.print("List Mobil Ke-"+ (jumlahMobil+1) + " : ");
                namaMobil[jumlahMobil] = userInput.next();
                System.out.println(" ");
    
            }
            
            
            System.out.println("\n====================\n");
            
            System.out.println("List Mobil: ");
            // Mulai menampilkan isi dari Array
            for(String tampilkanMobil : namaMobil){
                System.out.println(tampilkanMobil);
            }
            
            System.out.println("\n\nProgram Selesai");

        } finally {
            //  Close Scanner
            userInput.close();
        } 
        
        

    }
    
}
