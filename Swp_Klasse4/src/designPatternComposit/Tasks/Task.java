package designPatternComposit.Tasks;

public abstract class Task {

    private String title;

    public void setTitle(String title){
        this.title = title;
    }

    abstract String getTitle();

    abstract void display();



    public void addTask(Task task) {
    }
}
