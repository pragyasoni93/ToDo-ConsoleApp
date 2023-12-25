package dto;

public class Task {
    private int taskId;
    private String taskName;
    private TaskStatus taskStatus;
    private String deadline;

    public Task(int taskId, String taskName, TaskStatus taskStatus, String deadline) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
        this.deadline = deadline;
    }
}
