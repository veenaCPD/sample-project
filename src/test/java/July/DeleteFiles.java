package July;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteFiles {
    public static void main(String[] args) {
        File directoryPath = new File("C:\\Java_Practice\\Java_Practice\\src\\Resources\\Folder1");
        String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for(int i=0; i<contents.length; i++) {
            System.out.println(contents[i]);
            if(contents[i].contains("txt")){
                System.out.println("It's a Text file > " + contents[i]);
                File myFile = new File("C:\\Java_Practice\\Java_Practice\\src\\Resources\\Folder1\\" + contents[i] );
                myFile.delete();
            }
        }
    }
}
