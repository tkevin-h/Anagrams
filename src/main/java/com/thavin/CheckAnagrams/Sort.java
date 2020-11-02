package com.thavin.CheckAnagrams;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Sort {

    public static String sortWord(String word) {
        char[] wordArray = word.toCharArray();

        Arrays.sort(wordArray);

        return Arrays.toString(wordArray);
    }

    public static Set<String> findCombinations(String word) {
        Set<String> combinations = new TreeSet<>();

        if(word.length() == 1){
            combinations.add(word);
        }
        else {
            for(int i = 0; i < word.length(); i++) {
                String removeLetter = word.substring(0, i);
                String newWord = word.substring(i + 1);
                String remaining  = removeLetter+newWord;

                for(String permutation : findCombinations(remaining)) {
                    combinations.add(word.charAt(i) + permutation);
                }
            }
        }

        return combinations;
    }
}
