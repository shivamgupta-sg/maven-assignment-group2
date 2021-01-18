package com.knoldus;

public class StringFunctions {

    public String reverseString(String originalStr) {
        StringBuilder originalStringBuilder = new StringBuilder(originalStr);
        return originalStringBuilder.reverse().toString();
    }

    public int sizeOfStr(String strForSize) {
        return strForSize.length();
    }
}
