package at.milgram.test.plane;

public class Position {
    private int langitude;
    private int latitude;

    public Position(int langitude, int latitude) {
        this.langitude = langitude;
        this.latitude = latitude;
    }

    public int getLangitude() {
        return langitude;
    }

    public void setLangitude(int langitude) {
        this.langitude = langitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}

