package main.java.com.mmu.arrays;

import main.java.com.mmu.interfaces.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayResizer implements Task {

    public void fillArray() {

        String[] stringArray = new String[5];

        boolean end = false;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while(end == false) {
            System.out.println("Enter a string (to end the loop, input 'done'):");
            String temp = scanner.next();

            try{
                if (temp.toLowerCase().contains("done")){
                    end = true;
                    break;
                }
                stringArray[counter] = temp;
                counter++;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This array can only contain " + stringArray.length + " records. In order to avoid an exception the array's size will" +
                        " be increased by 5");
                stringArray = resizeArray(stringArray);
            }
        }

        System.out.println("The Array contains:");

        for (int i = 0; i < stringArray.length ; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public String[] resizeArray(String[] stringArray) {
        int oldLength = stringArray.length;
        int newLength = oldLength+5;
        String[] resizedArray = new String[newLength];

        for (int i = 0; i < oldLength; i++) {
                resizedArray[i] = stringArray[i];
        }
        return resizedArray;
    }

    public void fillArrayList(){
        ArrayList stringArrayList = new ArrayList<String>();

        boolean end = false;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while(end == false) {
            System.out.println("Enter a string (to end the loop, input 'done'):");
            String temp = scanner.next();
            if (temp.toLowerCase().contains("done")){
                end = true;
                break;
            }
                stringArrayList.add(counter, temp);
        }

        System.out.println("The Array List contains:");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }

    @Override
    public void execute() {
        System.out.println("First we will create a normal array with a limit of 5. Populate that with more than 5 records, then input done to finish.");
        fillArray();
        System.out.println("Now I will create an Arraylist instead, there will be no error handling this time. Input more than 5 strings.");
        fillArrayList();
        System.out.println("Lecture complete");
    }
}