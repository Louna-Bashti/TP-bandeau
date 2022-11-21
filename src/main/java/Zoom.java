import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {


    private String chain;
    private int repeat;
    private int time;


    public Zoom (String myChain, int myRepeat, int myTime) {
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
            myBandeau.setMessage(this.chain);
            myBandeau.sleep(this.time);
            for (int j = 5; j < 60; j += 5) {
                myBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                myBandeau.sleep(this.time);
            }

        }


    }
}
