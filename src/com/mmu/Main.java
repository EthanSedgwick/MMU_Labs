package com.mmu;

import com.mmu.lectures.arrays.HelloPlanets;
import com.mmu.lectures.arrays.TextProcessing;
import com.mmu.lectures.looper.DeterminateLooper;

import java.util.Scanner;

public class Main {

    private static DeterminateLooper determinateLooper;
    private HelloPlanets helloPlanets = new HelloPlanets();
    private static TextProcessing textProcessing;
    public static void main(String[] args) {

        DeterminateLooper determinateLooper = new DeterminateLooper();
        HelloPlanets helloPlanets = new HelloPlanets();
        TextProcessing textProcessing = new TextProcessing();
        Scanner scanner = new Scanner(System.in);
        boolean endLoop = false;


        while (endLoop == false) {

            System.out.println("Which lecture do you want to view?");
            int intInput = scanner.nextInt();

            switch (intInput) {
                case 1:
                    determinateLooper.execute();
                    break;
                case 2:
                    helloPlanets.execute();
                    break;
                case 3:
                    textProcessing.execute();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Please input a valid number");
                    break;
            }

            System.out.println("Do you wish to view another lecture? Enter y/n");
            String stringInput = scanner.next();

            switch (stringInput) {
                case "y":
                    break;
                case "n":
                    endLoop = true;
                    break;
                default:
                    System.out.println("You entered an invalid character. Ensure you ensure either y or n.");
                    break;
            }
        }

        System.out.println("Wow, this guy definitely deserves a first.");
    }
}
