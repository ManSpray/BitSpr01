package lt.mantas.app;
import java.util.Scanner;

public class Ciklai {
    public static void main (String[] args) {
        for (int i = 0; i > 1; i++ ) {
            System.out.println("Šis tekstas niekada nebus atspausdintas");
        }
        int a = 5;
        while (a > 6) {
            System.out.println("Šis tekstas niekada nebus atspausdintas");
        }
        // for (int i = 2; i < 1; i++ ) {
        //     System.out.println("Šis tekstas bus spausdinamas be galo");
        // }
        // int b = 0;
        // while (b < 1) {
        //     System.out.println("Šis tekstas bus spausdinamas be galo");
        //     b--;
        // }

        // //echo bet kam išskyrus q
        Scanner scan1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Įveskite ką tik norite, tik ne q raidę");
        while (a == 5){
            String betkas = scan1.nextLine();  // Read user input
            if (betkas.equals("q")) {
                break;
            }
            System.out.println(betkas);
        }

        //echo atvirkščiai
        Scanner scan2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Įveskite ką nors atvirkščiai, tik ne q raidę");
        while (a == 5){
            String betkas = scan2.nextLine();  // Read user input
            if (betkas.equals("q")) {
                break;
            }
            String atvirksciai = new StringBuffer(betkas).reverse().toString();
            System.out.println(atvirksciai);
        }


    }
}
