package record;

import models.AbstractCharacter;

public record QueenAction(String actionName, AbstractCharacter target) {
    public void logAction(String name, AbstractCharacter target) {
        System.out.print("Злая королева" + actionName);
    }
}