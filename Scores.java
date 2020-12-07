package readability;

public class Scores {
    private double scoreARI;
    private int ageARI;
    private double scoreFK;
    private int ageFK;
    private double scoreSMOG;
    private int ageSMOG;
    private double scoreCL;
    private int ageCL;
    private double averageAge;

    public Scores() {
        scoreARI = -1;
        ageARI = -1;
        scoreFK = -1;
        ageFK = -1;
        scoreSMOG = -1;
        ageSMOG = -1;
        scoreCL = -1;
        ageCL = -1;
        averageAge = -1;
    }

    public void setScoreARI(double scoreARI) {
        this.scoreARI = scoreARI;
    }

    public double getScoreARI() {
        return scoreARI;
    }

    public void setAgeARI(int ageARI) {
        this.ageARI = ageARI;
    }

    public int getAgeARI() {
        return ageARI;
    }

    public void setScoreFK(double scoreFK) {
        this.scoreFK = scoreFK;
    }

    public double getScoreFK() {
        return scoreFK;
    }

    public void setAgeFK(int ageFK) {
        this.ageFK = ageFK;
    }

    public int getAgeFK() {
        return ageFK;
    }

    public void setScoreSMOG(double scoreSMOG) {
        this.scoreSMOG = scoreSMOG;
    }

    public double getScoreSMOG() {
        return scoreSMOG;
    }

    public void setAgeSMOG(int ageSMOG) {
        this.ageSMOG = ageSMOG;
    }

    public int getAgeSMOG() {
        return ageSMOG;
    }

    public void setScoreCL(double scoreCL) {
        this.scoreCL = scoreCL;
    }

    public double getScoreCL() {
        return scoreCL;
    }

    public void setAgeCL(int ageCL) {
        this.ageCL = ageCL;
    }

    public int getAgeCL() {
        return ageCL;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }

    public double getAverageAge() {
        return averageAge;
    }
}
