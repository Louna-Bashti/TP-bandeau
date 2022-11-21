import bandeau.Bandeau;

public abstract class Effet {

    private String chain;
    private int time;
    private int repeat;


    public Effet(String myChain, int myTime, int myRepeat) {
        this.chain = myChain;
        this.time = myTime;
        this.repeat = myRepeat;
    }

    private String getChain() {
        return this.chain;
    }

    private double getTime() {
        return this.time;
    }

    private int getRepeat() {
        return this.repeat;
    }

    public abstract void runEffect(Bandeau myBandeau);
}
