package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Decrypt {
    private String toDecrypt; // String to decrypt
    private int size; // Size of string

    // Constructor for encryptor
    public Decrypt(String toDecrypt) {
        this.toDecrypt = toDecrypt;
        this.size = toDecrypt.length() / 3; // Added just for reading ease
    }

    // method for decryption.: Split in a string array, remove first x and last x (where size of string == 3x) and convert last segments
    public void decrypt(){
        //Variables to help
        ArrayList<String> midPath = new ArrayList<String>(); //Midpath helper

        // FIRST, convert the string into an arraylist. -- FIX
        midPath = (ArrayList<String>) Arrays.asList(this.toDecrypt);

        // SECOND, remove the first and last parts of the array.
        for (int i = 0; i < size; i++) {
            midPath.remove(0);
        }

        for (int i = size; i > 0 ; i--) {
            midPath.remove(i*2);
        }

        System.out.println(midPath);
        // THIRD, convert the rest, from octave to char





    }
}
