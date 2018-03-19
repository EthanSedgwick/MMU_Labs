package main.java.com.mmu.converter;

import main.java.com.mmu.interfaces.Task;

public class TemperatureConverter implements Task {
    public double fahrToCel(double fahr){
        double cel;
        cel = (fahr - 32) * 5 / 9;
        return cel;
    }

    public double celToFahr(double cel){
        double fahr;
        fahr = cel * 9 / 5 + 32;
        return fahr;
    }

    @Override
    public void execute() {
        double celTestValue = 20;
        double fahrTestValue = 68;
        System.out.println("20 Celsius converted to Fahrenheit is: " + celToFahr(celTestValue));
        System.out.println("64 Fahrenheit converted to Celsius is: " + fahrToCel(fahrTestValue));
    }
}