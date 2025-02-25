package designPatternAbstractFactory.Characters;

public abstract class CharacterFactory {

    public static CharacterFactory getFactory(GameType type){
        if(type == GameType.FANTASY){
            return new FantasyFactory();
        }else {
            return new SciFIFactory();
        }
    }


    public abstract Worrier createWorrier();
    public abstract Magician createMagician();

}
