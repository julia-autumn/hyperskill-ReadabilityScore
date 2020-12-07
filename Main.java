package readability;

import org.w3c.dom.Text;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException, java.nio.file.FileSystemException {
        Scanner scanner = new Scanner(System.in);

        TextReader textReader = new TextReader();
        textReader.readText(args[0]);
        TextAnalyser textAnalyser = new TextAnalyser(textReader.getText());
        TextMetrics textMetrics = textAnalyser.Analyze();

        System.out.println("The text is:\n" + textReader.getText() + "\n");
        System.out.println("Words: " + textMetrics.getWordsNumber());
        System.out.println("Sentences: " + textMetrics.getSentencesNumber());
        System.out.println("Characters: " + textMetrics.getCharactersNumber());
        System.out.println("Syllables: " + textMetrics.getSyllablesNumber());
        System.out.println("Polysyllables: " + textMetrics.getPolysyllablesWordsNumber());

        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");

        String sIndexName = scanner.nextLine();
        IndexCalculation indexCalculation = new IndexCalculation();
        indexCalculation.calculate(textMetrics, sIndexName);


        }


        /*        System.out.printf("The score is: %.2f", score);
        System.out.println("\nSyllables: " + syllablesCount);
        System.out.println("This text should be understood by " + age + " year olds.");
*/


        //  InputStream is = new FileInputStream("c:\\file.txt");
        /* TextReader.readText()
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
*/
        /* the rest
            //Scanner scanner = new Scanner(System.in);
            //String text = scanner.nextLine();
           // String[] sentences = textline.split("[.!?] ");
        //    sentencesCount = sentencesCount + sentences.length;
            int wordsCount = 0;

            for (int i = 0; i < sentences.length; i++) {
                String[] words = sentences[i].split(" ");
             //   if(words[words.length - 1].endsWith("[.!?] ")
                wordsCount = wordsCount + words.length;
                //syllables
                syllablesCount += syllablesCounter(words);

                // characters
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
/*      the score      score = (4.71 * ((double) charactersCount / (double) wordsCount)+
                    0.5 * ((double) wordsCount / (double) sentencesCount) - 21.43);
*/
/*
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
*/

}







