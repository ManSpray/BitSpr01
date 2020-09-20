package lt.mantas.app;

import java.io.*;

public class ReadWriteAppend {
    public static void main(String[] args) {
        // ... sukuriu failo objektą, kuris laiko info kur failas randasi
        File relativeFile = new File("./data/text1.txt");
        try {
            // standartinis būdas gauti duomenis iš teksitinio failo javo je
            FileReader fileReader = new FileReader(relativeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // skaitome eilutė po eilutės su .readLine() metodu
            String fileLine = bufferedReader.readLine(); // "\n", "\r\n" - ieško newline
            while (fileLine != null) { // žiūrome ar perskaityta eilutė nėra tuščia
                System.out.println(fileLine); // spausdiname visą eilutę

                // inicializuojame savo personų arraylistą su iš failo gautais duomenimis
                String[] splitString = fileLine.split(","); // fileLine.split("\\s;|\\s|;");

                // skaitome sekančią eilutę
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File was not found, check if it's there!");
        } catch ( IOException e){
            System.out.println("Some general IO error!");
        }

    }
}
