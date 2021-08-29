package ridetest;

public class SubTask {
	int id;
	String subTaskTitle;
	String status;
	Task parentTask;
	public SubTask(String subTaskTitle, String status, Task parentTask, int id) {
		super();
		this.subTaskTitle = subTaskTitle;
		this.status = status;
		this.parentTask = parentTask;
		this.id = id;
	}
	
}
