package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortTest {

    // Positive cases
    @Test
    void sortWord_shouldSortWordAlphabetically_whenGivenWord() {
        String word = "cba";

        assertEquals("abc", Sort.sortWord(word));
    }

    @Test
    void findCombinations_shouldFindAllCombinations_whenGivenWord() {
        String word1 = "abc";
        String word2 = "acb";
        String word3 = "bac";
        String word4 = "bca";
        String word5 = "cba";
        String word6 = "cab";

        String[] wordCombinations = new String[] {word1, word2, word3, word4, word5, word6};

        assertArrayEquals(wordCombinations, findCombinations(word1));

    }

    // Edge cases

    // Negative cases
    @Test
    void sortWord_shouldFail_whenWordIsNotSorted() {
        String word = "cba";

        assertNotEquals("bca", Sort.sortWord(word));
    }
}