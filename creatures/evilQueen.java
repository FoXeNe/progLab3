package creatures;

import interfaces.Disgusting;
import models.AbstractCharacter;
import models.Human;

public class evilQueen extends Human implements Disgusting {
    private boolean isWicked = true;

    public evilQueen() {
    }

    @Override
    public void speak(String phrase) {
        System.out.print(phrase);
    }
    @Override
    public void takeItem(String item) {
        System.out.print(item);
    }

    @Override
    public void smearWithWalnutJuice(AbstractCharacter target) {

    }

    @Override
    public void applySmellyOintment(AbstractCharacter target) {

    }

    @Override
    public void tangleHair(AbstractCharacter target) {

    }
}