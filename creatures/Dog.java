package creatures;

import enums.Appearance;
import interfaces.Recognizing;
import models.AbstractCharacter;
import models.Animal;

public class Dog extends Animal implements Recognizing{
    public Dog(String name, boolean hasInstinct, String soundType) {
        super(name, Appearance.BEAUTIFUL, hasInstinct, soundType);
    }

    @Override
    public boolean Recognize(AbstractCharacter target) {
        return false;
    }

    @Override
    public void makeSound() {
        System.out.print("гав");
    }

    @Override
    public boolean senseMagic() {
        return true;
    }
}
