package cobasendiri;

public class PerulanganFor2 {
    public static void main(String[] args) {
        
        System.out.println("Program For Each");

        /*
        Perulangan For Each digunakan untuk 
        menampilkan isi dari array 

        Array => variable yang menyimpan lebih dari 
        satu nilai dan memiliki indeks 

        */

        int barisanAngka [] = {1,2,3,4,5};

        for (int i : barisanAngka){
            System.out.print(i + " ");
        }

    }
}
