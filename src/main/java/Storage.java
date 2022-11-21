package ie.atu.Lab8;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Storage {
    public static void main(String[] args) {
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try {
            FileWriter myWriter = new FileWriter(myFile,true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("This is my fourth line");
            myPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}