package com.mmu.lectures.arrays;

import com.mmu.lectures.interfaces.Task;

public class TextProcessing implements Task{
    public static int timesCharOccurs(String str, Character character){
        char [] charArray = str.toCharArray();
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;
        char uppercaseChar = character.toString().toUpperCase().charAt(0);
        char lowercaseChar = character.toString().toLowerCase().charAt(0);

        for(int i = 0; i<charArray.length; i++ ){
            if(charArray[i] == uppercaseChar){
                uppercaseCounter++;
            }
//            else if(c)
        }
        return uppercaseCounter;
    }

    @Override
    public void execute() {
        System.out.println("Checking how many times \"e\" occurs in string \"All's well that ends well\"");
        timesCharOccurs("All's well that ends well", 'a');
    }
}