package com.mmu.lectures.looper;

import java.util.ArrayList;
import java.util.List;

public class IndeterminateLooper {

    private List<Double> listOfMarks = new ArrayList<>();

    private

    private void addMarks(double input) {
        listOfMarks.add(input);
    }

    private double sumMarks(){
        double value = 0;
        for(int i = 0; i < listOfMarks.size(); i++){
            value = value + listOfMarks.get(i);
        }
        listOfMarks.clear();
        return value;
    }
}
