package creatures;

import enums.Appearance;
import models.AbstractCharacter;

public class Brothers extends AbstractCharacter {
    private boolean isKicked;

    public Brothers(String name, Appearance appearance, boolean isKicked) {
        super(name);
        this.isKicked = isKicked;
    }

    public boolean isKicked() {
        return isKicked;
    }

   public void setKicked(boolean kicked) {
        isKicked = kicked;
   }
}
