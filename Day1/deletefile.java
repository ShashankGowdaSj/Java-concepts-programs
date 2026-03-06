package Day1;
import java.io.File;

public class deletefile {
    static void main(String[] args) {
        File bla=new File("filename.txt");
        if (bla.delete()){
            System.out.println("File deleted:"+bla.getName());
        }
        else {
            System.out.println("failed to delete the file");
        }

    }
}
