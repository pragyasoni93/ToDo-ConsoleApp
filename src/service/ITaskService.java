package service;

import java.util.List;

import dto.Task;

public interface ITaskService {

    public List<Task> addTask(Task task);

    public List<Task> updateTask(Task task);

    public List<Task> deleteTask(int taskId);

    public void showTasks();

}
