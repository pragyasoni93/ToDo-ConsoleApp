package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Task;

public class TaskRepository {

    public static List<Task> taskDB = new ArrayList<>();

    public boolean addTask(Task task) {
        return taskDB.add(task);
    }

    public List<Task> getTasks() {
        return taskDB;
    }


    
    
}
