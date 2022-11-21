package ie.atu.Lab8;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void main(String[] args) {
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try {
            FileWriter myWriter = new FileWriter("MyWriter.txt");
            myWriter.write("This is my second line");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}