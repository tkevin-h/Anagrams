package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class FindAnagramsTest {
    //Positive cases
    @Test
    void find_shouldReturnArrayOfWords_whenWordIsAnagram() {
        String word1 = "abc";
        String word2 = "acb";
        String word3 = "bac";
        String word4 = "bca";
        String word5 = "cba";
        String word6 = "cab";

        String[] combinations = new String[] {word1, word2, word3, word4, word5, word6};
        String[] wordCombinations = new String[] {word6};

        //assertArrayEquals(wordCombinations, find(combinations));
    }
}