package ridetest;

public class Task {
	//static int id;
	String title;
	String assignee;
	TaskType taskType;
	String status;
	public Task(String title, String assignee, TaskType taskType) {
		super();
		this.title = title;
		this.assignee = assignee;
		this.taskType = taskType;
		
	}
	public Task(String title, String assignee, TaskType taskType, String status) {
		super();
		this.title = title;
		this.assignee = assignee;
		this.taskType = taskType;
		this.status = status;
		
	}

}
