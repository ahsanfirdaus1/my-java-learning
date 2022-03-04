package cobasendiri;
public class IfLese2Bersarang {
    
    public static void main(String[] args) {
        
        System.out.println("Hello, Ahsan");
        System.out.println("Program If Else Java 2 Bersarang");

        String namaDepan = "Ahsan";
        String namaBelakang = "Firdaus"; 
        String namaLengkap;

        if (namaDepan == "Ahsan"){
            if(namaBelakang == "Firdaus"){
                namaLengkap = namaDepan + " " + namaBelakang;
                System.out.println("Nama Lengkap : "+ namaLengkap);
                
            }
        } else if(namaDepan == "Firdaus"){
            if(namaBelakang == "Ahsan"){
                namaLengkap = namaBelakang + " " + namaDepan;
                System.out.println("Nama Lengkap : " + namaLengkap);
                
            }

        } else {
            namaLengkap = "Apa hayooo";
        }


        
    }
}
