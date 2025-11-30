package models;

import enums.Appearance;
import interfaces.Disgusting;

public abstract class AbstractCharacter {
    private String name;
    private Appearance appearance;

    public AbstractCharacter() {
        super();
    }

    public String getName() {
        return name;
    }
}