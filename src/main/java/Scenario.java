import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {

    private ArrayList<Effet> myScenario;

    public Scenario () {
        myScenario = new ArrayList<Effet>();
    }

    public void addEffect(Effet e) {
        myScenario.add(e);
    }

    public void runScenario(Bandeau bandeau) {
        for(int i = 0; i < myScenario.size(); i++) {
            myScenario.get(i).runEffect(bandeau);
        }
    }


}
