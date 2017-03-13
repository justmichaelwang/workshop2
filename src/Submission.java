import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Sample private submission class to be replaced by your implementation

public class Submission {
    public int attemptNum;
    public int numFiles;
    private File[] files;
   
    
    public static void main(String[] args) {
    	Submission sub = new Submission();
    	sub.includedFiles();
    	
    }
    
    // Return two fake files
    public File[] includedFiles() {
        File[] files = new File[2];
        
        Date date1 = new Date();
        Date date2 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
        date1 = sdf.parse("2017-01-01");
        date2 = sdf.parse("2017-01-02");
        }
        catch(ParseException e){
        	e.printStackTrace();
        }
        files[0] = new File("test1", date1, "Elbert is a boy.\nJessie is a girl.\nMichael is a boy as well.\nElbert's family name is Wang.\nJessie's family name is Guo.\nMichael's family name is Wang.\n");
        files[1] = new File("test2", date2, "Elbert is a boy.\nJessie is a girl.\nMichael is a boy as well.\nElbert's family name is Wang.\nJessie's family name is Guo.\nMichael's family name is Wang.\nElbert is a boy.\nJessie is a girl.\nMichael is a boy as well.\nElbert's family name is Wang.\nJessie's family name is Guo.\nMichael's family name is Wang.\n");
        Assignment assignment = new Assignment();
        assignment.compare(files);
        System.out.println(files[0].content());
        return files;
    }

}
