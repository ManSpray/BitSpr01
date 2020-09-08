package lt.mantas.app;
import java.util.Scanner;  // Import the Scanner class


public class SalygosTeiginiai {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Įveskite savo amžių");

        int amzius = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Jūsų amžius yra: " + amzius);  // Output user input

        if (amzius > 45) {
            System.out.println("Jūs galite ne tik balsuoti, bet ir kandidatuoti");
        }
        else if (amzius >= 18 && amzius <= 45) {
            System.out.println("Jūs galite balsuoti, tačiau negalima kandidatuoti");
        }
        else {
            System.out.println("Jums balsuoti, kol kas, negalima");
        }


    }
}
