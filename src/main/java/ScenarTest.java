import bandeau.Bandeau;

import java.awt.*;

public class ScenarTest {

    public static void main(String[] args) {
        new ScenarTest().exemple();
    }


    public void exemple() {


        Bandeau monBandeau = new Bandeau();


        Scenario monScenario = new Scenario();

        ChangementCouleur chgmt1 = new ChangementCouleur("Hello", 500, 2, Color.CYAN);


        ChangementCouleur chgmt2 = new ChangementCouleur("Couleur rose", 100, 3, Color.PINK);
        Rotation rot1 = new Rotation("On va tourner", 2, 200, 1);
        Rotation rot2 = new Rotation("Encore", 2, 200, -1);
        Clignotant clign1 = new Clignotant("On clignote", 5, 100);
        Clignotant clign2 = new Clignotant("Encore", 5, 500);
        Zoom zoom1 = new Zoom("On va zoomer", 1, 1000);



        monScenario.addEffect(chgmt1);
        monScenario.addEffect(chgmt2);
        monScenario.addEffect(rot1);
        monScenario.addEffect(rot2);
        monScenario.addEffect(clign1);
        monScenario.addEffect(clign2);
        monScenario.addEffect(zoom1);

        monScenario.runScenario(monBandeau);


        //aide à observer les erreurs de la manip
        monBandeau.sleep(1000);
        monBandeau.close();




    }

}
