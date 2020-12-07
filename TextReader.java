package readability;

import java.io.File;
import java.util.Scanner;

public class TextReader {
    private String text = "";
    public void readText(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                //      try {
                text = text + scanner.nextLine();
                //    } catch (java.io.IOException e) {
                //      System.out.println(e.getMessage());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
           // return e.getMessage();
        } finally {

        }
        //return text;
    }

    public String getText() {
        return text;
    }

}
