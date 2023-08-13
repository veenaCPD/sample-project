package June;

public class myFile {

    String fileName1 = "";

    public myFile(String fileName){
        fileName1 = fileName;
    }

    public myFile(){
        fileName1 = "tmp.txt";
    }

    public void createNewFile(){
        // Code to create file fileName1
    }

    public String getName(){
        return fileName1;
    }
    /// String myFile = myObj.getName();

    public void myFile(){
        // "vk.txt"
    }



    public static void main(String[] args) {
        myFile myFile = new myFile();
        System.out.println("File create : " + myFile.getName());
    }

}
