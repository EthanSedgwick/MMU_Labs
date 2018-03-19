package main.java.com.mmu.looper;

import main.java.com.mmu.interfaces.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndeterminateLooper implements Task {

    private List<Double> listOfMarks = new ArrayList<>();

    private void addMarks() {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        while(end==false){
            double temp = scanner.nextDouble();
            if (temp == -9999) {
                break;
            }
            else if (temp < 1 | temp > 100){
                System.out.println("Please enter a number between 1 and 100");
            }
            else{
                listOfMarks.add(temp);
            }
        }
    }

    private double sumMarks(){
        double value = 0;
        for(int i = 0; i < listOfMarks.size(); i++){
            value = value + listOfMarks.get(i);
        }
        return value;
    }

    private double getLargestMark(){
        double largestNumber = 0;
        for (int i = 0; i < listOfMarks.size(); i++) {
            if (listOfMarks.get(i) > largestNumber){
                largestNumber = listOfMarks.get(i);
            }
        }
        return largestNumber;
    }

    @Override
    public void execute() {
        System.out.println("Input your marks, pressing enter to save each mark. When you're done input -9999");
        addMarks();
        System.out.println("The total of all your marks is " + sumMarks());
        System.out.println("The largest mark you received was " + getLargestMark());
    }
}
