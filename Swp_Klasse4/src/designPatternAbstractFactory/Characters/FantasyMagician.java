package designPatternAbstractFactory.Characters;

public class FantasyMagician extends  Magician{
    @Override
    public void create() {
        System.out.println("Fantasy Magician created");
        System.out.println("Spezialfähigkeit: Gedanken lesen");
    }
}
