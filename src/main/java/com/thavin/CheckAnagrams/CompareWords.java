package com.thavin.CheckAnagrams;

public class CompareWords {

    public static boolean checkAnagram(String wordOne, String wordTwo) {
        return wordOne.equals(wordTwo);
    }

    public static boolean checkLettersAmount(String wordOne, String wordTwo) {
        return wordOne.length() == wordTwo.length();
    }
}
