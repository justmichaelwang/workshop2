
public class Validator implements SubmissionValidator{

	@Override
	public ValidationError[] validateSubmission(Submission submission) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void comparision (File[] files) {
		files[0].equals(files[1]);
	}

}
