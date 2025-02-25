package designPatternAbstractFactory.Characters;

public class FantasyFactory extends CharacterFactory{

    @Override
    public Worrier createWorrier() {
        return new FantasyWorrier();
    }

    @Override
    public Magician createMagician() {
        return new FantasyMagician();
    }
}
