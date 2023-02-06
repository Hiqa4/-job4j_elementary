package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (176 - 100) * 1.15;
        return rsl;
    }

    public static double womanWight(short height) {
        double rsl = (165 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 176;
        double man = Fit.manWeight(height);
        System.out.println("Man 176 is " + man);
        height = 165;
        double woman = Fit.womanWight(height);
        System.out.println("Woman 165 is " + woman);
    }
}

