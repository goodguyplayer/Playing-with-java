package com.company;

import java.util.Scanner;
import com.company.Challenges.Challenge1;
import com.company.Challenges.Challenge2;


public class Main {

    public static void main(String[] args) {
        double base = 2, expo = 38;
        Scanner textinp = new Scanner(System.in);
        Challenge1 c1 = new Challenge1(base, expo);
        Challenge2 c2 = new Challenge2();

        c1.solution();
        c2.test();

    }
}
