package ie.atu.Lab8;


import java.io.*;
import java.util.Scanner;

public class Storage {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try {
            FileWriter myWriter = new FileWriter(myFile,true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("This is my fifth line");
            myPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter filename: ");
        String filename = myScan.nextLine();
        Scanner inputFile = new Scanner(new File(filename));
    }
}