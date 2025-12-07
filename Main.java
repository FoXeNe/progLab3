import creatures.Eliza;
import creatures.evilQueen;
import enums.Appearance;
import enums.LocationType;

public class Main {
    public static void main(String[] args) {
        Eliza eliza = new Eliza("Элиза");
        evilQueen queen = new evilQueen("Злая королева");

        queen.smearWithWalnutJuice(eliza);
        queen.applySmellyOintment(eliza);
        queen.tangleHair(eliza);

        eliza.cry();
        eliza.searchBrothers(LocationType.FOREST);
        eliza.yearn();

    }
}