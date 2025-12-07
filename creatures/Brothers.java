package creatures;

import enums.Appearance;
import models.AbstractCharacter;

public class Brothers extends AbstractCharacter {
    private boolean isKicked;

    public Brothers(String name) {
        super(name);
        this.isKicked = true;
    }
}
