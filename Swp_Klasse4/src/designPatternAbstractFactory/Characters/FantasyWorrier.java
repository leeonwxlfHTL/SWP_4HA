package designPatternAbstractFactory.Characters;

public class FantasyWorrier extends Worrier {
    public void create() {
        System.out.println("FantasyWorrier created");
        System.out.println("Spezialfähigkeit: Teleportation");
    }
}
