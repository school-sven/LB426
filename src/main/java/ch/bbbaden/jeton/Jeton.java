package ch.bbbaden.jeton;

import java.util.ArrayList;
import java.util.List;

public class Jeton {

    private final List<JetonTypes> jetons = new ArrayList<>();

    public Jeton(int value) {
        evaluateJeton(value);
    }

    public int getSum() {
        return jetons.stream().mapToInt(JetonTypes::getValue).sum();
    }

    public void add(int value) {
        evaluateJeton(getSum() + value);
    }

    public void remove(int value) {
        evaluateJeton(getSum() - value);
    }

    public void clear() {
        jetons.clear();
    }

    private void evaluateJeton(int value) {
        clear();
        for (JetonTypes jetonType : JetonTypes.getReversedValues()) {
            if (value >= jetonType.getValue()) {
                int amount = value / jetonType.getValue();
                for (int i = 0; i < amount; i++) {
                    jetons.add(jetonType);
                }
                value -= amount * jetonType.getValue();
                if (value == 0) {
                    break;
                }
            }
        }
    }

    public List<JetonTypes> getJetons() {
        return jetons;
    }

}
