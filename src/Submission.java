// Sample private submission class to be replaced by your implementation
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Submission {
    public int attemptNum;
    public int numFiles;
    private File[] files;
    // Return two fake files
    public File[] includedFiles() throws FileNotFoundException{
        File[] files = new File[2];
        files[0] = new File("test1.txt");
        files[1] = new File("test2.txt");
        String astring, bstring;
        Scanner fileIn1 = new Scanner(files[0]);
        Scanner fileIn2 = new Scanner(files[1]);
        astring = fileIn1.nextLine();
        System.out.println(astring);
        return files;
    }
}
