package main.java.com.mmu.file;

import main.java.com.mmu.interfaces.Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MarkChecker implements Task{

        final String PATH = "..\\MMU_Labs\\src\\main\\resources\\Marks";

        public void checkMarks() throws FileNotFoundException {
            ArrayList recordedMarks = new ArrayList<Double>();
            Scanner fileReader = new Scanner(new FileInputStream(new File("put the file path here")));

            double total = 0;
            double average;

            System.out.println("\nReading file at ..\\main\\resources\\Marks to retrieve marks");

            while (fileReader.hasNextDouble()) {
                recordedMarks.add(fileReader.nextDouble());
            }

            System.out.println("Your marks are:");

            for (int i = 0; i < recordedMarks.size(); i++) {
                System.out.println(recordedMarks.get(i));
                total = total + (double)recordedMarks.get(i);
            }

            average = total / 20;
            System.out.println("\nYour totaled marks add up to " + total + "\nAverage of these marks is " + average);

            fileReader.close();
        }

    @Override
    public void execute() {
        try{
            checkMarks();
        }
        catch(FileNotFoundException e){

        }
    }
}
