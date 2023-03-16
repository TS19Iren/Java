package oop.hw3;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
   private List<Task> myTaskList;

    public TasksList() {
        this.myTaskList =new ArrayList<>();
    }
    public void add(Task task){
        myTaskList.add(task);
    }
    public void remove(int index){
        myTaskList.remove(index);
    }
    public void change(int index, Task task){
        myTaskList.add(index,task);
        myTaskList.remove(index+1);
    }
    public void showAll(){
        for (Task task:myTaskList) {
            task.getInfo();
        }
    }

}
