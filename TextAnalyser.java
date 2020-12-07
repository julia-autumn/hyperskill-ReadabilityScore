package readability;

public class TextAnalyser {
    private String text; // remove later

    public TextAnalyser(String text) {
        this.text = text;
    }

    public TextMetrics Analyze() {
        TextMetrics textMetrics = new TextMetrics();
        String[] sentences = splitToSentences(text);
        textMetrics.setSentencesNumber(sentences.length);

         textMetrics.setWordsNumber(splitToWords(text).length);
         textMetrics.setCharactersNumber(charactersCounter(text));
         textMetrics.setSyllablesNumber(syllablesCounter(text));
         textMetrics.setPolysyllablesWordsNumber(polysyllablesWordsCounter(text));
         textMetrics.setLettersNumber(letterCounter(text));
        return textMetrics;
    }
    public String[] splitToSentences(String text) {
        String[] sentences = text.split("[.!?] ");
        return sentences;
    }

    public String[] splitToWords(String sentence) {
      //  String[] words = sentence.split(" ");

        String[] words = text.split(" |[.!?] ");

        return words;
    }

    public int wordCounter(String[] sentences) {
        int wordsNumber = 0;
        for (int i = 0; i < sentences.length ; i++) {
            wordsNumber = wordsNumber + splitToWords(sentences[i]).length;
        }

        return wordsNumber;
    }

    public int syllablesCounter (String text) {
        int syCounter = 0;
        int vowelCounter = 0;
        String[] words = splitToWords(text);
       // String words = splitToWords(splitToSentences(text));

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() <= 3 ) {
                syCounter++;
            } else {
                for (int j = 0; j < words[i].length() - 1; j++) {
                    if (isVowel(words[i].charAt(j))) {
                        syCounter++;
                        vowelCounter++;
                        if (isVowel(words[i].charAt(j + 1))) {
                            j++;
                        }

                    } else if((j + 1 == words[i].length() - 1) &&
                            isVowel(words[i].charAt(j + 1)) &&
                            words[i].charAt(j + 1) != 'e') {
                            syCounter++;
                        }

                }
                if(vowelCounter == 0) {
                    syCounter++;
                    // pollySy
                }
                else
                    vowelCounter = 0;
            }

        }
        return syCounter;
    }

    public int polysyllablesWordsCounter(String text) {
        int syCounter = 0;
       // int vowelCounter = 0;
        int polysyllablesWordsCounter = 0;
        String[] words = splitToWords(text);

        for (int i = 0; i < words.length; i++) {
            syCounter = 0;
            if (words[i].length() > 4) {  // 3?
                for (int j = 0; j < words[i].length() - 1; j++) {
                    if (isVowel(words[i].charAt(j))) {
                        syCounter++;
                        //vowelCounter++;
                        if(syCounter == 3) {
                            polysyllablesWordsCounter++;
                            break;
                        }
                        if (isVowel(words[i].charAt(j + 1))) {
                            j++;
                        }
                    } else if((j + 1 == words[i].length() - 1) &&
                            isVowel(words[i].charAt(j + 1)) &&
                            words[i].charAt(j + 1) != 'e') {
                        polysyllablesWordsCounter++;
                    }

                }
            }

        }
        return polysyllablesWordsCounter;
    }

    public int charactersCounter(String text) {
        /*for (int i = 0; i < words.length; i++) {
            charactersCount += words[i].length();
        }
    }
    charactersCount += sentences.length - 1;

*/
        return text.replaceAll(" ", "").length();
    }

    public int letterCounter(String text) {
        int letterCounter = 0;
        String[] words = splitToWords(text);
        for (String w: words) {
            letterCounter += w.length();
        }
        //return text.replace("[ .,!\\?]", "").length();
        //System.out.println("Letters " + letterCounter);
         return letterCounter - 1;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U' ||
                ch == 'y' || ch == 'Y') {
            return true;
        }
        else
            return false;
    }
}
