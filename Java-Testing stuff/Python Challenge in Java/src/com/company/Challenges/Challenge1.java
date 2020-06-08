package com.company.Challenges;
import java.lang.Math;
public class Challenge1 {
    // Basic stuff, it says 2^38. So we take those two and output the answer.
    private double base, expo;

    public Challenge1(double base, double expo) {

        this.base = base;
        this.expo = expo;
    }

    public void solution(){
        System.out.println(Math.pow(this.base, this.expo));
    }
}
