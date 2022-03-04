package cobasendiri;

public class Array1 {

    public static void main(String[] args) {
        
        String namaLengkapSaya [] = {"Ahsan", "Firdaus", "Tirta"};

        // Menampilkan semua isi dari array 
        for (int i=0; i< namaLengkapSaya.length;i++){
            System.out.println("Isi ke-"+ i + " : " + namaLengkapSaya[i]);
        }

        // Array dimulai dari indeks ke-0
        System.out.println(namaLengkapSaya[0]);
        System.out.println(namaLengkapSaya[1]);
        System.out.println(namaLengkapSaya[2]);
    }
    
}
