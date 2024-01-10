package at.milgram.OOProgramming.Car;

public class RearMirror {
    private int size;
    private int position;

    public RearMirror(int size, int postion){
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
