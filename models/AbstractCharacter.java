package models;

import enums.Appearance;
import interfaces.Disgusting;

public abstract class AbstractCharacter {
    protected String name;
    private Appearance appearance;

    public AbstractCharacter(String name) {
        this.name = name;
    }
}