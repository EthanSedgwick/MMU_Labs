package main.java.com.mmu;

import main.java.com.mmu.arrays.Alphabet;
import main.java.com.mmu.arrays.ArrayResizer;
import main.java.com.mmu.arrays.HelloPlanets;
import main.java.com.mmu.arrays.TextProcessing;
import main.java.com.mmu.converter.TemperatureConverter;
import main.java.com.mmu.file.MarkChecker;
import main.java.com.mmu.looper.DeterminateLooper;
import main.java.com.mmu.looper.IndeterminateLooper;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        DeterminateLooper determinateLooper = new DeterminateLooper();
        ArrayResizer arrayResizer = new ArrayResizer();
        MarkChecker markChecker = new MarkChecker();
        IndeterminateLooper indeterminateLooper = new IndeterminateLooper();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Alphabet alphabet = new Alphabet();
        HelloPlanets helloPlanets = new HelloPlanets();
        TextProcessing textProcessing = new TextProcessing(alphabet.getAlphabet());

        Scanner mainScanner = new Scanner(System.in);

        boolean endLoop = false;

        while (endLoop == false) {

            System.out.println("Which lab do you want to view?");
            int intInput = mainScanner.nextInt();

            switch (intInput) {
                case 1:
                    System.out.println("Hello world");
                    break;
                case 2:
                case 7:
                    determinateLooper.execute();
                    break;
                case 8:
                    indeterminateLooper.execute();
                    break;
                case 9:
                    temperatureConverter.execute();
                    break;
                case 11:
                    helloPlanets.execute();
                    textProcessing.execute();
                    break;
                case 13:
                    markChecker.execute();
                    break;
                case 17:
                    arrayResizer.execute();
                    break;
                default:
                    System.out.println("Number not recognized, perhaps the lecture is missing or the value is out of bounds." +
                            "\nPlease input a valid number");
                    break;
            }

            System.out.println("Do you wish to view another lecture? Enter y/n");
            String stringInput = mainScanner.next();

            switch (stringInput.toLowerCase()) {
                case "y":
                    break;
                case "n":
                    endLoop = true;
                    break;
                default:
                    System.out.println("You entered an invalid character. Ensure you ensure either y or n. Terminating program.");
                    break;
            }
        }
        mainScanner.close();
        System.out.println("Wow, this guy definitely deserves a first.");
    }
}
