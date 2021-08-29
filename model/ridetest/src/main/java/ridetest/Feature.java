package ridetest;

public class Feature implements TaskType{

	String featureSummary;
	String impact;
	String status;
	
	public Feature(String featureSummary, String impact, String status) {
		super();
		this.featureSummary = featureSummary;
		this.impact = impact;
		this.status = status;
	}

	public void getTaskType() {
		// TODO Auto-generated method stub
		
	}

}
