import java.util.Date;

public class Assignment implements SubmissionValidator{
	public String name;
	public String description;
	public Date dueDate;
	public int maxAttempts;
	public Assignment(File[] files){

	}

	public Assignment(String name, String description, Date dueDate, int maxAttempts){
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.maxAttempts = maxAttempts;
	}
	
	public Submission[] validSubmissions(){
		Submission[] validSubms = new Submission[2];
		return validSubms;
		
	}
	
	public Submission[] invalidSubmissions(){
		Submission[] invalidSubms = new Submission[2];
		return invalidSubms;
		
	}

	public ValidationError[] validateSubmission(Submission submission){

	}
}
