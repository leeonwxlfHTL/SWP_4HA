package designPatternObserver.TempSens;

public class MainTempSens {

    public static void main(String[] args){
        Display d = new ConcreteDisplay();
        TempSens t = new ConcreteTempSens();

        t.addObserver(d);
        t.setValue("20");
        System.out.println(d.getValue() + " = " + t.getValue());
    }
}
