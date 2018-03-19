package main.java.com.mmu.arrays;

import main.java.com.mmu.interfaces.Task;

public class TextProcessing implements Task{

    public static final String TEST_STRING = "All's well that ends well, Ethan";
    public static final String TEST_STRING_2 = "I love programming";
    private char[] alphabet;

    public TextProcessing(char[] alphabet) {
        this.alphabet = alphabet;
    }


    public void timesCharOccurs(String str, Character character){



        String characterAsString = character.toString();
        int totalCounter;
        int uppercaseCounter;
        int lowercaseCounter;
        char uppercaseChar = character.toString().toUpperCase().charAt(0);
        char lowercaseChar = character.toString().toLowerCase().charAt(0);

        char [] charArray = str.toCharArray();
        System.out.println("The letter " + character + " occurs in lowercase " + getCharOccurances(characterAsString.toLowerCase().charAt(0), charArray) + " times");
        System.out.println("The letter " + character + " occurs in uppercase " + getCharOccurances(characterAsString.toUpperCase().charAt(0), charArray) + " times");
        charArray = str.toLowerCase().toCharArray();
        System.out.println("The letter " + character + " occurs in total " + getCharOccurances(character, charArray) + " times");
    }

    public int getCharOccurances(Character character, char[] charArray) {
        int tempCounter = 0;
        for(int i = 0; i < charArray.length; i++ ){
            if(charArray[i] == character){
                tempCounter++;
            }
        }
        return tempCounter;
    }


    @Override
    public void execute() {
        System.out.println("Checking how many times \"e\" occurs in string \"" + TEST_STRING + "\"");
        timesCharOccurs(TEST_STRING, 'e');
        System.out.println("Checking how many times each letter of the alphabet occurs in string " + TEST_STRING_2);
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("The letter " + alphabet[i] + " occurs " + getCharOccurances(alphabet[i], TEST_STRING_2.toUpperCase().toCharArray()) + " times.");
        }
    }
}