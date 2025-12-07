package creatures;

import enums.Appearance;
import interfaces.Disgusting;
import models.AbstractCharacter;

import java.nio.file.FileSystemNotFoundException;

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
        target.appearance = Appearance.BROWN_SKIN;
        System.out.println("Намазала соком " + target.toString());
    }

    @Override
    public void applySmellyOintment(AbstractCharacter target) {
        System.out.println("чето сделала короче");
    }

    @Override
    public void tangleHair(AbstractCharacter target) {
        target.appearance = Appearance.UNKEMPT;
        System.out.println("связала волосы элизы");
    }
}