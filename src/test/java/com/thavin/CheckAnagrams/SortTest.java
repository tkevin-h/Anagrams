package com.thavin.CheckAnagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    // Positive cases
    @Test
    public void sortWord_shouldSortWordAlphabetically_whenGivenWord() {
        String word = "cba";

        assertEquals("abc", Sort.sortWord(word));
    }


    // Edge cases

    // Negative cases
}