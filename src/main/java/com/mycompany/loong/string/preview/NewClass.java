package com.mycompany.loong.string.preview;

import org.apache.commons.lang3.RandomStringUtils;

public class NewClass {

    public static void main(String[] args) {
        int charCount = 1024*1024;
        String randomString = RandomStringUtils.random(charCount);
        System.out.println(randomString);
    }
}
