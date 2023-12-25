package controller;

import java.util.List;

import dto.Task;
import dto.TaskStatus;
import service.ITaskService;
import service.TaskService;

public class ToDoController {

  private ITaskService taskService = new TaskService();

  public static void runToDoApp() {
    showMenu();
    String userAction = getUserInput("Enter the Action Number");
    performAction(Integer.parseInt(userAction));
  }

  private static void showMenu() {
    System.out.println("Welcome to the ToDo App!");
    System.out.println("Action Menu: ");
    System.out.println("1. Add a new task");
    System.out.println("2. Update an existing task");
    System.out.println("3. Delete an existing task");
    System.out.println("4. List all Tasks");
  }

  private static String getUserInput(String inputMessage) {
    System.out.print(inputMessage + " : ");
    return System.console().readLine();
  }

  private static List<Task> performAction(int action) {
    switch (action) {
      case 1:
        return addTask();
      case 2:
        return updateTask();
      case 3:
        return deleteTask();
      case 4:
        return showTasks();
      default:
        System.out.println("Invalid Action");
        return null;
    }
  }

  private static List<Task> addTask() {
    String taskName = getUserInput("Enter the Task Name");
    String taskDeadline = getUserInput("Enter the Task Deadline (Optional). Press Enter to skip");
    Task task = new Task(1, taskName, TaskStatus.PENDING, taskDeadline);
    return taskService.addTask(task);

  }

  private static List<Task> updateTask() {
    return null;
  }

  private static List<Task> deleteTask() {
    return null;
  }

  private static List<Task> showTasks() {
    return null;
  }

}
