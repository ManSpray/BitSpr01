package lt.mantas.app;


public class PrimitybusDuomTipai {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MIN_VALUE;
        System.out.println(i);
        System.out.println(j);
        long pop = 7775000000L;
        if (i <= pop) {
            System.out.println("Visų žemėje gyvenančių žmonių skaičius yra per didelis, kad tilptų į" +
                    " Integer duomenų tipą, reikia naudoti long arba double");
        }
        else {
            System.out.println("Žemėje gyvenančių žmonių skaičius telpa į Integer duomenų tipą");
        }
        long asmKodas = 36907209999L;
        if (i <= asmKodas) {
            System.out.println("Lietuviško asmens kodo reikšmės negalima saugoti naudojant Integer duomenų tipą," +
                    " reikia naudoti long arba double ");

        }
        else {
            System.out.println("Lietuvišką asmens kodo reikšmę galima saugoti naudojant Integer duomenų tipą");
        }
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
// import java.io.IOException;
// import java.io.InputStream;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.Scanner;
// //from  w  ww  .  java  2  s  . c o m
//
// public class PrimitybusDuomTipai {
//     public static void main(String[] args) {
//         System.out
//                 .println(jsonGetRequest("https://api.exchangeratesapi.io/2018-05-05"));
//     }
//
//     private static String streamToString(InputStream inputStream) {
//         String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
//         return text;
//     }
//
//     public static String jsonGetRequest(String urlQueryString) {
//         String json = null;
//         try {
//             URL url = new URL(urlQueryString);
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             connection.setDoOutput(true);
//             connection.setInstanceFollowRedirects(false);
//             connection.setRequestMethod("GET");
//             connection.setRequestProperty("Content-Type", "application/json");
//             connection.setRequestProperty("charset", "utf-8");
//             connection.connect();
//             InputStream inStream = connection.getInputStream();
//             json = streamToString(inStream); // input stream to string
//         } catch (IOException ex) {
//             ex.printStackTrace();
//         }
//         return json;
//     }
// }


