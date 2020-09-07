package com.thavin.CheckAnagrams;

import java.util.Arrays;

public class CompareWords {

    public static boolean checkAnagram(String wordOne, String wordTwo) {
        if(!checkLettersAmount(wordOne, wordTwo)) {
            return false;
        }

        char[] wordOneArray = wordOne.toCharArray();
        char[] wordTwoArray = wordTwo.toCharArray();

        Arrays.sort(wordOneArray);
        Arrays.sort(wordTwoArray);

        return Arrays.equals(wordOneArray, wordTwoArray);
    }

    public static boolean checkLettersAmount(String wordOne, String wordTwo) {
        return wordOne.length() == wordTwo.length();
    }
}
