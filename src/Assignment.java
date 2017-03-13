import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

public class Assignment implements SubmissionValidator{
	public String name;
	public String description;
	public Date dueDate;
	public int maxAttempts;
	private static String standard= new String("Elbert is a boy.\nJessie is a girl.\nMichael is a boy as well.\nElbert's family name is Wang.\nJessie's family name is Guo.\nMichael's family name is Wang.\n");
	public Assignment(){
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

	public boolean compare(File[] files){

		for (File f:files){
			double score = this.similarity(f.content(),standard);
            System.out.printf("Similarity is %.2f%%.\n",score*100.0);

			System.out.println(f.content());
		}
		return true;
	}

	public ValidationError[] validateSubmission(Submission submission){
		return null;
	}


	/**
	 * Calculates the similarity (a number within 0 and 1) between two strings.
	 */
	public static double similarity(String s1, String s2) {
		if (s1.length() == 0) { return 1.0; /* both strings are zero length */ }
		return (s1.length() - editDistance(s1, s2)) / (double) s2.length();

	}

	// implementation of the Levenshtein Edit Distance
	public static int editDistance(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		Vector<String> a1= new Vector<String>(s1.length());
		Vector<String> a2= new Vector<String>(s2.length());
		StringTokenizer str = new StringTokenizer(s1," ,.");
		while (str.hasMoreTokens()) {
			a1.add(str.nextToken());
		}
		StringTokenizer str1 = new StringTokenizer(s2," ,.");
		while (str1.hasMoreTokens()) {
			a2.add(str1.nextToken());
		}


		int[] costs = new int[s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++) {
			int lastValue = i;
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0)
					costs[j] = j;
				else {
					if (j > 0) {
						int newValue = costs[j - 1];
						if (s1.charAt(i - 1) != s2.charAt(j - 1))
							newValue = Math.min(Math.min(newValue, lastValue),
									costs[j]) + 1;
						costs[j - 1] = lastValue;
						lastValue = newValue;
					}
				}
			}
			if (i > 0)
				costs[s2.length()] = lastValue;
		}
		return costs[s2.length()];
	}
}
