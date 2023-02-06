package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double resultMan = (height - 100) * 1.15;
        return resultMan;
    }

    public static double womanWight(short height) {
        double resultWoman = (height - 110) * 1.15;
        return resultWoman;
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

