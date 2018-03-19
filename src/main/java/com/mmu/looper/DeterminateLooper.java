package main.java.com.mmu.looper;

import main.java.com.mmu.interfaces.Task;

public class DeterminateLooper implements Task{
    private static final String SUM_OF_RESULTS_MESSAGE = "The sum of your results is: ";
    private static final String AVERAGE_OF_RESULTS_MESSAGE = "The average of your results is: ";
    private static final String INPUT_LESS_THAN_ZERO_ERROR_MESSAGE = "Please ensure the number you enter is greater than 0.";
    private static final String GREEN_BOTTLES_OPENING_LINE = " green bottles hanging on the wall";
    private static final String GREEN_BOTTLES_THIRD_LINE = "And if one green bottle should accidentally fall,";
    private static final String GREEN_BOTTLES_FINAL_LINE_PREFIX = "There'll be ";
    private static final String GREEN_BOTTLES_FINAL_LINE_SUFFIX = " green bottles hanging on the wall";

    private void printEvenNumbers() {

        int MIN_NUMBER = 1;
        for (int i = MIN_NUMBER; i <= 8; i++) {
            double evenCheck = i % 2;
            if (evenCheck == 0){
                System.out.println(i);
            }
        }
    }

    private void calculateFinalMark(int examResult1, int examResult2, int examResult3, int examResult4) {
        int sumOfResults = examResult1+examResult2+examResult3+examResult4;
        int averageOfResults = sumOfResults/4;

        System.out.println(SUM_OF_RESULTS_MESSAGE + sumOfResults);
        System.out.println(AVERAGE_OF_RESULTS_MESSAGE + averageOfResults);

        String GRADE_ACHIEVED_PREFIX = "You achieved the grade: ";
        if (averageOfResults>=70){
            System.out.println(GRADE_ACHIEVED_PREFIX + "1st");
        }
        else if (averageOfResults>=60) {
            System.out.println(GRADE_ACHIEVED_PREFIX + "2:1");
        }
        else if (averageOfResults>=50) {
            System.out.println(GRADE_ACHIEVED_PREFIX + "2:2");
        }
        else if (averageOfResults>=40) {
            System.out.println(GRADE_ACHIEVED_PREFIX + "3rd");
        }
        else {
            String FAILURE_MESSAGE = "Unfortunately, you have failed.";
            System.out.println(FAILURE_MESSAGE);
        }
    }

    private void singGreenBottles(int initialNumber){
        if (initialNumber <= 0){
            System.out.println(INPUT_LESS_THAN_ZERO_ERROR_MESSAGE);
        }
        for(int i = initialNumber; i > 0; i--) {
            String openingLine = i + GREEN_BOTTLES_OPENING_LINE;
            String finalLine = GREEN_BOTTLES_FINAL_LINE_PREFIX + (i-1) + GREEN_BOTTLES_FINAL_LINE_SUFFIX;
            System.out.println(openingLine);
            System.out.println(openingLine);
            System.out.println(GREEN_BOTTLES_THIRD_LINE);
            System.out.println(finalLine);
            System.out.println();
        }

    }

    private void playFizzBuzz(int maxNumber) {
        for(int i = 1; i < maxNumber; i++){
            int modOf3 = i % 3;
            int modOf5 = 1 % 5;
            boolean lineBreak = false;
            if (modOf3 == 0) {
                System.out.print("Fizz");
                lineBreak = true;
            }
            if (modOf5 ==0) {
                System.out.print("Buzz");
                lineBreak = true;
            }
            if (lineBreak == true) {
                System.out.println();
            }
            if (lineBreak == false) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void execute(){
        System.out.println("Printing even numbers with a max number of 8");
        printEvenNumbers();
        System.out.println("Calculating Final Mark with a exam results of 20, 80, 76 or 44");
        calculateFinalMark(20, 80, 76, 44);
        System.out.println("Singing Green Bottles with an initial number of 4");
        singGreenBottles(4);
        System.out.println("Playing Fizz Buzz with a max number of 15");
        playFizzBuzz(15);
    }
}
