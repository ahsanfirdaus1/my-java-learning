package cobasendiri;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Program Do While Pada Java");

        /*
        Do While Mirip Seperti Perulangan While, bedanya 
        Do While melakukan perulangan 1x terlebih dahulu
        */
        int i = 0;

        do { 
            System.out.println("i ke-"+ i);
            i++;
        } while (i <=5);
    }
}
