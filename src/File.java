import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {
    public String fileName;
    public Date createDate;
    public String fileData;
    public File (String fileName,Date createDate,String fileData){
        this.fileName = fileName;
        this.createDate = createDate;
        this.fileData = fileData;
    }
    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }
    public int fileSize(){
        double num = Math.random();
        if(num<0.5){
            return 100;
        } else {
            return 1024;
        }
    }
    public String content(){
        return this.fileData;
    }
}
