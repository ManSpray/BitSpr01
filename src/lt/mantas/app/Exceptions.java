package lt.mantas.app;

public class Exceptions {
    public static void main(String[] args){
        int res;
        try {
            // ... pavojingas kodas
            res = 1 / 0; // ArithmeticException: / by zero
            // } catch (Exception e){
            //     System.out.println("Įvyko klaida!");
        } finally {
            // finally blokas bus iškviestas, net jei darysime res = 1 / 1;
            // … ir net jei nebus catch bloko
            System.out.println("Finally blokas!");
        }

        System.out.println("Programos pabaiga!");
    }
    
}
