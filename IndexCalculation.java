package readability;

public class IndexCalculation {
    private static Scores scores;

    private int[] nGrades = {6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 24, 90};

    public IndexCalculation() {
        scores = new Scores();
    }

    public void calculate(TextMetrics textMetrics, String sIndexName) {
        if ("ARI".equals(sIndexName)) {
            indexARI(textMetrics);
            printIndexARI();
        }

        if ("FK".equals(sIndexName)) {
            indexFK(textMetrics);
            printIndexFK();
        }

        if ("SMOG".equals(sIndexName)) {
            indexSMOG(textMetrics);
            printIndexSMOG();
        }

        if ("CL".equals(sIndexName)) {
            indexCL(textMetrics);
            printIndexCL();
        }

        if ("all".equals(sIndexName)) {
            indexARI(textMetrics);
            indexFK(textMetrics);
            indexSMOG(textMetrics);
            indexCL(textMetrics);
            printAllIndexes();
        }
    }

    public void indexARI(TextMetrics textMetrics){
        double scoreARI = 0D;

        scoreARI = (4.71 * ((double) textMetrics.getCharactersNumber() /
                (double) textMetrics.getWordsNumber())+
                0.5 * ((double) textMetrics.getWordsNumber() /
                        (double) textMetrics.getSentencesNumber()) - 21.43);
        scores.setScoreARI(scoreARI);
        scores.setAgeARI(nGrades[(int)Math.floor(scoreARI) - 1]);

        //return scores;
    }

    private void printIndexARI() {
        System.out.printf("\nAutomated Readability Index: %.2f (about %d year olds).",
                scores.getScoreARI(), scores.getAgeARI());
    }

    public void indexFK(TextMetrics textMetrics) {
        double scoreFK = 0D;

        scoreFK = 0.39 * textMetrics.getWordsNumber() / textMetrics.getSentencesNumber() +
                11.8 * textMetrics.getSyllablesNumber() / textMetrics.getWordsNumber() - 15.59;

        scores.setScoreFK(scoreFK);
        scores.setAgeFK(nGrades[(int)Math.floor(scoreFK) - 1]);

        //return scores;
    }

     private void printIndexFK() {
         System.out.printf("\nFlesch-Kincaid readability tests: %.2f (about %d year olds).",
                 scores.getScoreFK(), scores.getAgeFK());
     }

    public void indexSMOG(TextMetrics textMetrics) {
        double scoreSMOG = 0D;

        scoreSMOG = 1.043 *
                Math.sqrt(textMetrics.getPolysyllablesWordsNumber() * 30.0 / textMetrics.getSentencesNumber()) +
                3.1291;

        scores.setScoreSMOG(scoreSMOG);
        scores.setAgeSMOG(nGrades[(int)Math.floor(scoreSMOG) - 1]);

       // return scores;
    }

    private void printIndexSMOG() {
        System.out.printf("\nSimple Measure of Gobbledygook: %.2f (about %d year olds).",
                scores.getScoreSMOG(), scores.getAgeSMOG());
    }

    public void indexCL(TextMetrics textMetrics) {
        double scoreCL = 0D;

        double L = 0D;
        double S = 0D;

        L = 100.0 * (textMetrics.getCharactersNumber()) /  textMetrics.getWordsNumber();
        S = 100.0 * textMetrics.getSentencesNumber() / textMetrics.getWordsNumber();

        scoreCL = 0.0588 * L - 0.296 * S - 15.8;

        scores.setScoreCL(scoreCL);
        scores.setAgeCL(nGrades[(int)Math.floor(scoreCL) - 1]);

       // return scores;
    }

    private void printIndexCL() {
        System.out.printf("\nColeman-Liau index: %.2f (about %d year olds).",
                    scores.getScoreCL(), scores.getAgeCL());
    }

    private void printAllIndexes() {
        printIndexARI();
        printIndexFK();
        printIndexSMOG();
        printIndexCL();

        System.out.printf("\n\nThis text should be understood in average by %.2f year olds.",
                calculateAverageAge());
            }

    private double calculateAverageAge() {
        return (scores.getAgeARI() + scores.getAgeFK() + scores.getAgeSMOG() + scores.getAgeCL()) / 4.0;
    }


}
