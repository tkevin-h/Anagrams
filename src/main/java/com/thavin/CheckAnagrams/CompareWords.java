package com.thavin.CheckAnagrams;

public class CompareWords {

    public boolean checkAnagram(String wordOne, String wordTwo) {
        return wordOne.equals(wordTwo);
    }

    public boolean checkLettersAmount(String wordOne, String wordTwo) {
        return wordOne.length() == wordTwo.length();
    }
}
