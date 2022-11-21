import bandeau.Bandeau;

public class Clignotant extends Effet {

    public Clignotant (String myChain, int myRepeat, int myTime) {
        super(myChain, myTime, myRepeat);
    }

    private String getChain() {
        return this.chain;
    }

    private int getTime() {
        return this.time;
    }

    private int getRepeat() {
        return this.repeat;
    }

    @Override
    public void runEffect(Bandeau myBandeau) {
        for(int i = 0; i<=this.repeat; i++) {
            for(int j = 0; j<=4; j++) {
                myBandeau.setMessage(this.chain);
                myBandeau.sleep(this.time);
                myBandeau.setMessage("");
                myBandeau.sleep(this.time);
            }
        }


    }
}
