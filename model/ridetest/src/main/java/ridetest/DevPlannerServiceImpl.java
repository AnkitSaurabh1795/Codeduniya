package ridetest;

import java.util.HashMap;
import java.util.Map;

public class DevPlannerServiceImpl implements DevPlannerService{
	static int taskId;
	static int subTaskId;
	public DevPlannerServiceImpl(int taskId, int subTaskId) {
		super();
		this.taskId = taskId;
		this.subTaskId = subTaskId;
	}

	static Map<Integer,Task> taskMap = new HashMap<Integer, Task>();
	static Map<Integer,SubTask> subTaskMap = new HashMap<Integer, SubTask>();
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		if(taskMap.containsKey(taskId)) {
			System.out.print("This Task " + taskId +" already exist");
		}else {
			taskMap.put(taskId,task);
		}
			
		taskId++;
		subTaskId++;
		System.out.println(taskId );
		System.out.println(subTaskId );
		
	}

	public void addsubTask(SubTask subTask) {
		// TODO Auto-generated method stub
		if(subTaskMap.containsKey(subTaskId)) {
			System.out.print("This Task " + subTaskId +" already exist");
		}else {
			subTaskMap.put(subTaskId,subTask);
		}
		
	}

	public void showTaskAssinged(String name) {
		// TODO Auto-generated method stub
		Task currTask =null;
		for(Map.Entry<Integer,Task> entry : taskMap.entrySet()) {
			currTask = entry.getValue();
			if(currTask.assignee.equals(name)) {
				System.out.print("Task of " + name + " is " + currTask.title + " ");
				
			}
		}
		for(Map.Entry<Integer,SubTask> entry : subTaskMap.entrySet()) {
			
			SubTask currSubTask = entry.getValue();
			Task parentTask = currSubTask.parentTask;
			if(parentTask.assignee.equals(name)) {
				System.out.print("SubTask of " + name + " is " + currSubTask.subTaskTitle + " and " + currSubTask.status + " ");
			
			}
		}
			
		
	}

}
