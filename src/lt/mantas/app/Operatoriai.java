package lt.mantas.app;

public class Operatoriai {
    public static void main (String[] args) {
        int i = 5;
        System.out.println(i%2);
        // System.out.println(2/0); //uzkomentuota nes meta errora, kadangi dalyba is nulio negalima

        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // kas bus išspausdinta? false - nepataikiau, kodėl 5 < 5 ???
        System.out.println(x <= y && y > 5); // kas bus išspausdinta? false
        System.out.println("abc" instanceof String); // kas bus išspausdinta? true
    }
}
