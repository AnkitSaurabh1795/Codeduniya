package ridetest;

public class TaskTypeFactory {
	public TaskType getTaskType(String taskType,String summary, String impact, String status) {
		if(taskType == null)
			return null;
		if(taskType.equalsIgnoreCase("Feature"))
			return new Feature(summary,impact,status);
		else if(taskType.equalsIgnoreCase("Bug"))
			return new Bug(impact,status);
		else if(taskType.equalsIgnoreCase("Story"))
			return new Story(summary,status);
		
		return null;
	}

}
