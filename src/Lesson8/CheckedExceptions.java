package Lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) {

        //Interrupted Exception

//        System.out.println("Program is paused for 5 seconds");
//        Thread.sleep(5000);
//        System.out.println("Program is resumed");

        //Interrupted Exception Handling
//        System.out.println("Program is paused for 5 seconds");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ignored) {
//            System.out.println("Interrupted Exception Caught");
//        }
//        System.out.println("Program is resumed");

        //File Not Found Exception & IO Exception

//        FileReader fileReader= null;
//        fileReader = new FileReader("C:\\Users\\user\\Downloads\\Java\\note.txt");
//        BufferedReader bufferedReader= new BufferedReader(fileReader);
//        System.out.println(bufferedReader.readLine());


        //File Not Found Exception & IO Exception Handling

//        FileReader fileReader= null;
//        try {
//            fileReader = new FileReader("C:\\Users\\user\\Downloads\\Java\\note.txt");
//            BufferedReader bufferedReader= new BufferedReader(fileReader);
//            System.out.println(bufferedReader.readLine());
//        } catch (FileNotFoundException ignored) {
//            System.out.println("File Not Found Exception Caught");
//        } catch (IOException ignored){
//            System.out.println("IO Exception Caught");
//        }

    }

}
