package lt.mantas.app;

public class paskaita9_14 {
    public static void main (String [] args) {
        System.out.println(factorialR(4));
    }
    public static int factorialR(int i){
        if(i <= 1) return 1; //base case
        return i* factorialR(i-1); //recursive step
    }
}
