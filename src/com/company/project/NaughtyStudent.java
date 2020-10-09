package com.company.project;

public class NaughtyStudent extends Student {
    private final int HACK_PERCENTAGE = 10;
    private final int TOTAL_PERCENTAGE = 100;

    @Override
    public Double getAverageGrade() {
        Double originalGrade =  super.getAverageGrade();
        //40 + 10%<4> == 44
        Double percentValue = (originalGrade * HACK_PERCENTAGE)/TOTAL_PERCENTAGE;

        return (originalGrade+percentValue);
    }
}
