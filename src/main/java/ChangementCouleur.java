import bandeau.Bandeau;

import java.awt.*;

public class ChangementCouleur extends Effet {

    private Color couleur;

    public ChangementCouleur (String myChain, int myTime, int myRepeat, Color myCouleur) {
        super(myChain, myTime, myRepeat);
        this.couleur = myCouleur;
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

    private Color getColor() {
        return this.couleur;
    }

    @Override
    public void runEffect(Bandeau myBandeau) {
        for(int i = 1; i<=getRepeat(); i++) {
            myBandeau.setMessage(getChain());
            myBandeau.setForeground(getColor());
            myBandeau.sleep(getTime());
            myBandeau.setForeground(Color.BLACK);
            myBandeau.sleep(getTime());
        }
    }



}
