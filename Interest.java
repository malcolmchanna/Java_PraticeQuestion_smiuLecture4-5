package com.company;

public class Interest {
    public static void main(String[] args) {
        double rate = 0.05;
        double principle = 1000.0;
        double amount;

        System.out.printf("%s%20s\n", "year", "amount on deposit");

        for (int year = 1; year <= 10; year++) {
            amount = principle * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f\n", year, amount);
        } //for end
    }// main end
}


