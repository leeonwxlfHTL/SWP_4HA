package designPatternAbstractFactory.Characters;

public class SciFiMagician  extends  Magician{
    @Override
    public void create() {
        System.out.println("SciFi Magician created");
        System.out.println("Spezialfähigkeit: Fliegen");
    }
}
