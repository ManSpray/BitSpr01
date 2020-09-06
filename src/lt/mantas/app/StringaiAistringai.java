package lt.mantas.app;

public class StringaiAistringai {
    public static void main (String[] args) {
        // String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
        // System.out.println("Sveiki, Jonai,"+ newLine + "kaip sekasi?" );
        System.out.println("Sveiki, Jonai,\nkaip sekasi?" );

        String i = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(i.toLowerCase());
        System.out.println(i.toUpperCase());
        System.out.println(i.replace('o','z')); // čia panašu, kad tekstą verčia į lenkų kalbą
        System.out.println(i.endsWith("elit")); //true
    }
}
