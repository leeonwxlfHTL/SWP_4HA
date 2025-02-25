package designPatternAbstractFactory.Characters;

public class SciFIFactory extends CharacterFactory{
    @Override
    public Worrier createWorrier() {
        return new SciFiWorrier();
    }

    @Override
    public Magician createMagician() {
        return new SciFiMagician();
    }
}
