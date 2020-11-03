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
            //Take each letter and combine with all other letters
            for(int i = 0; i < word.length(); i++) {
                String removeLetter = word.substring(0, i);
                String newWord = word.substring(i + 1);
                String remaining  = removeLetter+newWord;

                //Recursive
                for(String permutation : findCombinations(remaining)) {
                    String wordCombo = word.charAt(i) + permutation;

                    //why is this still adding words that have less characters than the original word?
                    if (wordCombo.length() == word.length()) {
                        combinations.add(word.charAt(i) + permutation);
                        System.out.println(word.charAt(i) + permutation);
                    }
                }
            }
        }

        return combinations;
    }
}
