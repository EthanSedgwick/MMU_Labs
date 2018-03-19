package main.java.com.mmu.arrays;

import main.java.com.mmu.interfaces.Task;

public class HelloPlanets implements Task {
    String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Pluto"};

    public void sayHello() {
        for (int i = 0; i < (planets.length); i++) {
            System.out.println("Hello " + planets[i]);
        }
    }

    @Override
    public void execute() {
        System.out.println("Saying hello!");
        sayHello();
    }
}
