package designPatternComposit.Tasks;

public class SimpleTask extends Task{

    private String title;

    @Override
    String getTitle() {
        return (title);
    }

    @Override
    void display() {
        System.out.println(title);
    }

}
