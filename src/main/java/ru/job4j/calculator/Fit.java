package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWight(short height) {
       return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 193;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        height = 170;
        double woman = Fit.womanWight(height);
        System.out.println("Woman " + height + " is " + woman);
    }
}

