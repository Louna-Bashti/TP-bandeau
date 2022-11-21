import bandeau.Bandeau;

import java.awt.*;

public class Rotation extends Effet {

    private int sens;

    public Rotation (String myChain, int myRepeat, int myTime, int mySens) {
        super(myChain, myTime, myRepeat);
        if (mySens != 1 && mySens != -1) {
            throw new IllegalArgumentException("Le sens doit être horaire ou antihoraire");
        }
        this.sens = mySens;
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
            double rot = 0.0f;
            for(int j = 0; j<=12; j++) {
                myBandeau.setMessage(this.chain);
                myBandeau.sleep(this.time);
                myBandeau.setRotation(rot);
                rot = rot + (Math.PI/6.0f)*this.sens;
            }
        }


    }
}
