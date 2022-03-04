package cobasendiri;
import java.util.*;

public class PerulanganWhile {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Perulangan While");

        /*
        Perulangan While dapat diartikan "selama" kondisi terpenuhi
        */

        boolean runningTheProgram = true;
        String answer;


        while (runningTheProgram){
            System.out.println("2x-3 = 5, Berapakah nilai dari x?\na 8 \nb 10\n");
            answer = userInput.nextLine().toLowerCase();

            if (answer.equalsIgnoreCase("a")){
                System.out.println("Jawaban Anda Benar!");
                runningTheProgram = false;
            } else {
                System.out.println("Jawaban Anda Belum Tepat, Silahkan Coba Lagi!");
            }

        }

        System.out.println("Akhir dari program, sampai jumpa lagi :)");
        userInput.close();

    }
}
