package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String test = "Test";
        Encrypt encrypt = new Encrypt(test);

        System.out.println(encrypt.encrypt());
        Decrypt decrypt = new Decrypt(encrypt.encrypt());
        decrypt.decrypt();

    }
}
