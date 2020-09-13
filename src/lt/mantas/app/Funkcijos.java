package lt.mantas.app;

public class Funkcijos {
    public static void main(String[] args) {
        sideEffect();
        int[] b = {51, 59, 18, 5, 14, 15, 55};

        System.out.println("Mažiausia masyvo reikšmė: " + maziausias(b));
        System.out.println("Didžiausia masyvo reikšmė: " + didziausias(b));
        System.out.println("Masyvo suma: " + suma(b));
    }
    public static void sideEffect(){
        System.out.println("Side-effect");
        //no return
    }
    public static int maziausias(int[] b) {
        // System.out.println(b.length);
        int min = b[0];
        for (int i =0; i<b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        // System.out.println(min);
        return min;
    }
    public static int didziausias(int[] b) {
        int max = b[0];
        for (int i =0; i<b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
    public static int suma(int[] b) {
        int suma = 0;
        for (int i =0; i<b.length; i++) {
            suma = suma + b[i];
        }
        return suma;
    }

}
