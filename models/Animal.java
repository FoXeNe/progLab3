package models;

public abstract class Animal extends AbstractCharacter {
    private final boolean hasInstinct;
    private final String soundType;

    public Animal(boolean hasInstinct, String soundType) {
        this.hasInstinct = hasInstinct;
        this.soundType = soundType;
    }

    public abstract void makeSound();
    public abstract boolean senseMagic();
}