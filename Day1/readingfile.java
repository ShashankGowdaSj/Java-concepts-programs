package Day1;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class readingfile {
    static void main(String[] args) {
        File obj=new File("filename.txt");
        try(Scanner reader=new Scanner(obj)){
            while (reader.hasNextLine()){
                String data= reader.next();
                System.out.println(data);
            }


        }
        catch (IOException e){
            System.out.println("bla-bla");
            e.printStackTrace();
        }
    }
}
