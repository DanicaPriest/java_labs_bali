package part_05.Exercise_04;

public class MST3K_Movies {
    private int decade;
    private String bestLine;
    private String mainCharacter;
    private boolean isHorror;

    public MST3K_Movies(boolean isHorror) {
        this.isHorror = isHorror;
    }
    public MST3K_Movies(boolean isHorror, int decade) {
        this.isHorror = isHorror;
        this.decade = decade;

    }

    public MST3K_Movies(int decade) {
        this.decade = decade;
    }
    public MST3K_Movies(int decade, String mainCharacter) {
        this.decade = decade;
        this.mainCharacter = mainCharacter;
    }

    public MST3K_Movies(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
    public MST3K_Movies(String mainCharacter, boolean isHorror) {
        this.mainCharacter = mainCharacter;
        this.isHorror = isHorror;
    }

    public int getDecade() {
        return decade;
    }

    public void setDecade(int decade) {
        this.decade = decade;
    }

    public String getBestLine() {
        return bestLine;
    }

    public void setBestLine(String bestLine) {
        this.bestLine = bestLine;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public boolean isHorror() {
        return isHorror;
    }

    public void setHorror(boolean horror) {
        isHorror = horror;
    }
}
