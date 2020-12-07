package readability;

public class TextMetrics {
    private int sentencesNumber;
    private int wordsNumber;
    private int syllablesNumber;
    private int polysyllablesWordsNumber;
    private int charactersNumber;
    private int lettersNumber;

    public TextMetrics() {
        sentencesNumber = 0;
        wordsNumber = 0;
        syllablesNumber = 0;
        polysyllablesWordsNumber = 0;
        charactersNumber = 0;
        lettersNumber = 0;
    }

    public TextMetrics(int sentencesNumber, int wordsNumber, int syllablesNumber,
                       int polysyllablesWordsNumber, int charactersNumber) {
        this.sentencesNumber = sentencesNumber;
        this.wordsNumber = wordsNumber;
        this.syllablesNumber = syllablesNumber;
        this.polysyllablesWordsNumber = polysyllablesWordsNumber;
    }

    public void setSentencesNumber(int sentencesNumber) {
        this.sentencesNumber = sentencesNumber;
    }

    public int getSentencesNumber() {
        return sentencesNumber;
    }

    public void setWordsNumber(int wordsNumber) {
        this.wordsNumber = wordsNumber;
    }

    public int getWordsNumber() {
        return wordsNumber;
    }

    public void setCharactersNumber(int charactersNumber) {
        this.charactersNumber = charactersNumber;
    }

    public int getCharactersNumber() {
        return charactersNumber;
    }

    public void setSyllablesNumber(int syllablesNumber) {
        this.syllablesNumber = syllablesNumber;
    }

    public int getSyllablesNumber() {
        return syllablesNumber;
    }

    public void setPolysyllablesWordsNumber(int polysyllablesWordsNumber) {
        this.polysyllablesWordsNumber = polysyllablesWordsNumber;
    }

    public int getPolysyllablesWordsNumber() {
         return polysyllablesWordsNumber;
    }

    public void setLettersNumber(int lettersNumber) {
        this.lettersNumber = lettersNumber;
    }

    public int getLettersNumber() {
        return lettersNumber;
    }
}
