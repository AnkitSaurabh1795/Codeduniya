package ridetest;

import java.util.List;

public class Story implements TaskType{
	String summary;
	List<SubTask> subTaskList;
	String status;
	

	public Story(String summary, String status) {
		super();
		this.summary = summary;
		this.status = status;
	}
	public void addSubtask(SubTask subTask) {
		subTaskList.add(subTask);
	}


	public void getTaskType() {
		// TODO Auto-generated method stub
		
	}

}
