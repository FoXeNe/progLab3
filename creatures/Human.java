package creatures;

import enums.Appearance;
import models.AbstractCharacter;

import java.util.List;
import java.util.Spliterator;

public class Human extends AbstractCharacter {
    private List<String> inventory;
    private String phrase;

    public Human(String name) {
        super(name);
        this.inventory = inventory;
        this.phrase = phrase;
    }

    public void Speak(String phrase) {
        System.out.print(name + " сказал:" + phrase);
    }

    public void takeItem(String item) {
        inventory.add(item);
        System.out.print(name + " взял" + item);
    }
}
