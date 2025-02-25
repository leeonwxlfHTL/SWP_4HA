package designPatternAbstractFactory.Characters;

public class SciFiWorrier extends  Worrier{
    public void create() {
        System.out.println("SciFiWorrier created");
        System.out.println("Spezialfähigkeit: Unsichtbarkeit");
    }
}
