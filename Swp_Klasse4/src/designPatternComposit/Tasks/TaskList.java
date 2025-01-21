package designPatternComposit.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskList extends  Task{
    private List<Task> tasks;
    private String title;


    public TaskList(){
        tasks = new ArrayList<Task>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
@Override
    public void display(){
        System.out.println("[");
        for (Task t : tasks){
            t.display();
        }
        System.out.println("]");
    }

    public String getTitle(){
        return title;
    }




}
