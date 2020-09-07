package com.thavin.CheckAnagrams;

import java.util.Arrays;

public class Sort {

    public static String sortWord(String word) {
        char[] wordArray = word.toCharArray();

        Arrays.sort(wordArray);

        return Arrays.toString(wordArray);
    }
}
