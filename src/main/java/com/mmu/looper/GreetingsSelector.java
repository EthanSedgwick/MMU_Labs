package main.java.com.mmu.looper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GreetingsSelector {

    ArrayList greetingsArray = new ArrayList(Arrays.asList("Hello", "Greetings", "Welcome"));
    public void getGreetings(int input){

        boolean end = false;
        while(end == false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a number from 0-2 to get a unique greeting!");
            

            System.out.println("Would you like to try again? enter y/n");
            String input = scanner.nextLine().toLowerCase()
            if (input == "y"){}
            else if (input == "n"){
                end = true;
            }
            else {
                System.out.println("You have entered an invalid character, terminating lab.");
                break;
            }
        }

}
