package models;

import java.util.List;

public abstract class Human extends AbstractCharacter {
    private List<String> inventory;
    private String phrase;

    public Human() {
    }

    public void speak(String phrase) {

    }
    public void takeItem(String item) {

    }
}