package creatures;

import interfaces.Disgusting;
import models.AbstractCharacter;

public class evilQueen extends Human implements Disgusting {
    private boolean isWicked = true;
    String actionName;

    public evilQueen(String name) {
        super(name);
    }

    public void speak(String phrase) {
        System.out.println("злая королева сказала: " + phrase);
    }
    @Override
    public void takeItem(String item) {
        System.out.println(item);
    }

    @Override
    public void smearWithWalnutJuice(AbstractCharacter target) {
        System.out.println("Намазала с соком элизу");
    }

    @Override
    public void applySmellyOintment(AbstractCharacter target) {
        System.out.println("чето сделала короче");
    }

    @Override
    public void tangleHair(AbstractCharacter target) {
        System.out.println("связала волосы элизы");
    }
}