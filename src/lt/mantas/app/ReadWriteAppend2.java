package lt.mantas.app;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWriteAppend2 {
    public static void main(String[] args) {
        File relativeFile2 = new File("./data/a.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile2);
            BufferedWriter bw = new BufferedWriter(fw);
            String fileLine = "Mindaugas";
            bw.write(fileLine);
            // for (int k = 0; k < 20000; k++) {
            //     bw.write("A");
            // }

            // writting file with newline
            String fileLine2 = "Mindaugas\n";
            bw.write(fileLine2);
            bw.write("Jonas");
            bw.newLine();
            bw.write("Antanas");
            bw.write("\n");
            bw.write("Petras"); // neprideda new line
            // bw.flush();
            bw.close(); // close automatically flushes the buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
        //-----------------------------------------------------------------------
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("b.csv"), true));
            String fileLine = "\nappended file line";
            bufferedWriter.write(fileLine);
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        //-----------------------------------------------------------------------
        try {
            URL url = new URL("https", "www.delfi.lt", "/");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = in.readLine();

            while (inputLine != null) {
                System.out.println(inputLine);
                inputLine = in.readLine();
            }
        } catch(MalformedURLException e){
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
