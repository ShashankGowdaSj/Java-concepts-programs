package Day1;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
    static void main(String[] args) {
        try {


            FileWriter myw = new FileWriter("filename.txt");
            myw.write("today is a good day, have wonderful friday");
            myw.close();
            System.out.println("successfully returned");



        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }

    }
}
