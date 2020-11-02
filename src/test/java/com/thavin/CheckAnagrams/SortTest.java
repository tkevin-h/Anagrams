package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

public class SortTest {

    // Positive cases
    @Test
    void sortWord_shouldSortWordAlphabetically_whenGivenWord() {
        String word = "cba";

        assertEquals("abc", Sort.sortWord(word));
    }

    @Test
    void findCombinations_shouldFindAllCombinations_whenGivenWord() {
        /*String word1 = "abc";
        String word2 = "acb";
        String word3 = "bac";
        String word4 = "bca";
        String word5 = "cba";
        String word6 = "cab";*/

        Set<String> wordCombinations = new TreeSet<>();
        wordCombinations.add("abc");
        wordCombinations.add("acb");
        wordCombinations.add("bac");
        wordCombinations.add("bca");
        wordCombinations.add("cba");
        wordCombinations.add("cab");

        //String[] wordCombinations = new String[] {word1, word2, word3, word4, word5, word6};

        assertEquals(wordCombinations, Sort.findCombinations("abc"));
    }

    @Test
    void calculateTotalCombinations_shouldReturnInt_whenGivenWord() {
        String word = "abc";
        int combinations = 6;

       // assertEquals(combinations, calculateTotalCombinations(word));
    }

    // Edge cases

    // Negative cases
    @Test
    void sortWord_shouldFail_whenWordIsNotSorted() {
        String word = "cba";

        assertNotEquals("bca", Sort.sortWord(word));
    }
}