package com.company.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    // Change letter forward by +2
    String s = "Thisisatest";
    List<Character> chars = new ArrayList<>();

    public void test() {
        for (char ch: s.toCharArray()) {
            chars.add(ch);
            System.out.println(ch);
        }
    }

}
