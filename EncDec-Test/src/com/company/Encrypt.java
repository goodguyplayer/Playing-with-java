package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Encrypt {
    Random rand = new Random(); // For random
    private String toEncrypt; // String to encrypt
    private int size; // Size of string

    // Constructor for encryptor
    public Encrypt(String toEncrypt) {
        // Basic stuff
        this.toEncrypt = toEncrypt;
        this.size = toEncrypt.length(); // Added just for reading ease
    }

    // For the random numbers
    private int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // For every item in the list, if instance of x shows up, remove and get another random.
    private void cleaner(ArrayList<String> list, String toRemove){
        for (String item: list) {
            while (item.equals(toRemove)){
                item = String.valueOf(getRandomNumberInRange(100, 999));
            }
        }
    }

    // This is where the encryption dance happens. Maybe rename to "run"?
    public String encrypt(){
        // Variables to assist us.:

        ArrayList<String> helper = new ArrayList<String>();
        ArrayList<String> midPath = new ArrayList<String>(); // Midpath to output
        String output = ""; // Full output

        // List 1 (str) - Convert every number to str. each item has to have size 3, from 100 to 999
        ArrayList<String> frontStr = new ArrayList<String>();

        // List 2 (str) - Convert every number to str. each item has to have size 3, from 100 to 999
        ArrayList<String> backStr = new ArrayList<String>();

        // FIRST, convert the text into octal. Via ASCII, every char is 3 num large
        for (char item: toEncrypt.toCharArray() ) {
            midPath.add(Integer.toOctalString(item));
        }

        // SECOND, fill frontal and back strings with random numbers. We'll clean them later
        for (int i = 0; i < size; i++) {
            frontStr.add(String.valueOf(getRandomNumberInRange(100, 999)));
            backStr.add(String.valueOf(getRandomNumberInRange(100, 999)));
        }

        // THIRD, the cleaning stage.
        cleaner(frontStr, midPath.get(0));
        cleaner(backStr, midPath.get(this.size - 1));

        //////////////////////////////////////////Removed for testing purposes///////////////////////////////////////////////
        // Reason for removal.: Considering the string gets 3 times it's original size, we could just divide it by 3?
        //Fourth, after cleaning, replace the first pos and last pos of both strings with first item and last item of midpath
        //this.frontStr.set(0, this.midPath.get(0));
        //this.backStr.set(this.size - 1, this.midPath.get(this.size - 1));
        //////////////////////////////////////////Removed for testing purposes///////////////////////////////////////////////

        // FOURTH, combine all strings together.
        helper.addAll(frontStr);
        helper.addAll(midPath);
        helper.addAll(backStr);

        // FIFTH, add EVERYTHING into output
        for (String item: helper) {
            output = output + item;
        }

        // SIXTH, send it out
        return output;
    }
}
