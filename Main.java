package readability;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException, java.nio.file.FileSystemException {
        String textline = "";
        String age = "";
        int sentencesCount = 0;
        int charactersCount = 0;
        Double score = 0D;

        //  InputStream is = new FileInputStream("c:\\file.txt");
        try {
            File file = new File(args[0]);

            Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            //      try {
            textline = scanner.nextLine();
            //    } catch (java.io.IOException e) {
            //      System.out.println(e.getMessage());
        }
        scanner.close();
        } catch (Exception e) {
//            System.out.println("exc");
            return;
            } finally {

        }

            //Scanner scanner = new Scanner(System.in);
            //String text = scanner.nextLine();
            String[] sentences = textline.split("[.!?] ");
            sentencesCount = sentencesCount + sentences.length;
            int wordsCount = 0;

            for (int i = 0; i < sentences.length; i++) {
                String[] words = sentences[i].split(" ");
                wordsCount = wordsCount + words.length;

                for (int j = 0; j < words.length; j++) {
                    charactersCount += words[j].length();
                }
            }
                charactersCount += sentences.length - 1;



                //   double ave = wordsCount / sentences.length;
/*
        if (ave <= 10) {
             System.out.println("EASY");
         } else {
             System.out.println("HARD");
         }
*/
            score = (4.71 * ((double) charactersCount / (double) wordsCount)+
                    0.5 * ((double) wordsCount / (double) sentencesCount) - 21.43);

            System.out.println("Words: " + wordsCount);
            System.out.println("Sentences: " + sentencesCount);
            System.out.println("Characters: " + charactersCount);
            System.out.printf("The score is: %.2f", score);

            switch ((int)Math.ceil(score)) {
                case 1: age = "5-6";
                        break;
                case 2: age = "6-7";
                        break;
                case 3: age = "7-9";
                        break;
                case 4: age = "9-10";
                        break;
                case 5: age = "10-11";
                        break;
                case 6: age = "11-12";
                        break;
                case 7: age = "12-13";
                        break;
                case 8: age = "13-14";
                        break;
                case 9: age = "14-15";
                        break;
                case 10: age = "16-16";
                        break;
                case 11: age = "16-17";
                        break;
                case 12: age = "17-18";
                        break;
                case 13: age = "18-24";
                        break;
                case 14: age = "24+";
                        break;
                default: age = "0";
                         break;
            }

            System.out.println("\nThis text should be understood by " + age + " year olds.");


    }
}
