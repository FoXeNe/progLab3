package record;

import models.AbstractCharacter;

public record QueenAction(String actionName, AbstractCharacter target) {
    private String actionName(String actionName) {
        return actionName;
    }
    private AbstractCharacter target(AbstractCharacter target) {
        return target;
    }
    public void logAction(String name, AbstractCharacter target) {
    }
}