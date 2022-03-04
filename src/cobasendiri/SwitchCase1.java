package cobasendiri;
// Coba import library untuk input output
import java.util.Scanner;
// Kalau mau semuanya juga bisa make java.util.*;


public class SwitchCase1 {
    
    public static void main(String[] args) {

        //  Membuat untuk inputan nanti dengan nama userInput
        Scanner inputScanner = new Scanner(System.in);

        // Tanya user
        String askuser = "Haloo, ada siapa nii? ";
        System.out.println(askuser);

        //  .nextLine() untuk mengambil input dengan tipe data String
        //  toLowerCase() supaya yang diinput dirubah jadi huruf kecil 
        String userInput = inputScanner.nextLine().toLowerCase();


        switch (userInput){
            case "ahsan" :
                System.out.println("Halo Ahsan");
                break;
            case "biden":
                System.out.println("Lho kok presiden amrik?");
                break;
            case "ayang":
                System.out.println("Sat set sat set");
                System.out.println("Jawab : ");
                
                break;
            default:
                System.out.println("Lha, ini siapa berarti?");
                System.out.println("Semoga hari mu senin terus hehe");
            
            // Jangan lupa nama inputannya ditutup ya
            inputScanner.close();

        }

        

    }
}
