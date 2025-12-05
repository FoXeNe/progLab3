package creatures;

import enums.LocationType;
import interfaces.Traveling;

import java.util.List;


public class Eliza extends Human implements Traveling {
    private boolean isCrying;
    private List<Brothers> brothers;
    private boolean destinationKnown;
    private LocationType currLocation;

    public Eliza(String name) {
        super(name);
        this.isCrying = false;
        this.brothers = brothers;
        this.destinationKnown = false;
        this.currLocation = currLocation;
    }

    public void cry() {
        isCrying = true;
        System.out.println(name + " заплакала");
    }

    public void yearn() {
        cry();
        System.out.println(name + " истосковалась по" + brothers);
    }

    public void searchBrothers() {
        System.out.println(name + " пошла искать братьев");
        wanderlnSwamp();
    }

    @Override
    public void walkTo(LocationType destination) {
        System.out.println(name + " идет в " + destination);
        wanderlnSwamp();
    }

    @Override
    public void wanderlnSwamp() {
        System.out.println(name + " бредет по болотам");
        currLocation = LocationType.SWAMP;
    }
}