package models;

import enums.Appearance;

public abstract class Animal extends AbstractCharacter {
    private boolean hasInstinct;
    private String soundType;

    public Animal(String name, Appearance appearance, boolean hasInstinct, String soundType) {
        super(name);
        this.hasInstinct = hasInstinct;
        this.soundType = soundType;
    }

    public abstract void makeSound();
    public abstract boolean senseMagic();
}