package ridetest;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int taskId =1;
		int subTaskId = 1;
		DevPlannerServiceImpl dev =  new DevPlannerServiceImpl(taskId,subTaskId);
		TaskTypeFactory taskTypeFactory = new TaskTypeFactory();
		TaskType taskType = taskTypeFactory.getTaskType("Feature","Create console for debugging", "Low", "Open");
		TaskType taskType2 = taskTypeFactory.getTaskType("Bug","Create order dashboard", "Medium", "Open");
		TaskType taskType3 = taskTypeFactory.getTaskType("Story","Create story dashboard", "High", "Open");

		Task t1 = new Task("Create feature" ,"Peter",taskType);
		Task t2 = new Task("Create order" ,"Peter",taskType2);
		Task t3 = new Task("Create story" ,"Saurabh",taskType3);
		SubTask subtask1 = new SubTask("Development","Open",t1,subTaskId);
		dev.addTask(t1);
		dev.addTask(t2);
		dev.addTask(t3);
		
		
		
		dev.addsubTask(subtask1);
		dev.showTaskAssinged("Saurabh");
		dev.showTaskAssinged("Peter");

	}

}
