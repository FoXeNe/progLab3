import creatures.Eliza;
import creatures.evilQueen;
import enums.Appearance;

public class Main {
    public static void main(String[] args) {
        Eliza eliza = new Eliza("Элиза");
        evilQueen queen = new evilQueen("Злая королева");

        queen.smearWithWalnutJuice(eliza);
        queen.applySmellyOintment(eliza);
        queen.tangleHair(eliza);

        eliza.cry();

    }
}