package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompareWordsTest {

    // Positive cases
    @Test
    void checkAnagram_shouldReturnTrue_whenWordsAreEqual() {
        String a = "abc";
        String b = "abc";

        assertTrue(CompareWords.checkAnagram(a, b), "Words are not the same.");
    }

    @Test
    void checkLettersAmount_shouldReturnTrue_whenNumberOfLettersAreEqual() {
        String a = "abcd";
        String b = "bcda";

        assertTrue(CompareWords.checkLettersAmount(a, b), "Letters count are the not same.");
    }


    // Edge cases

    // Negative cases
    @Test
    void checkAnagram_shouldReturnFalse_whenWordsAreNotEqual() {
        String a = "abcd";
        String b = "abce";

        assertFalse(CompareWords.checkAnagram(a, b), "Words are not the same.");
    }

    @Test
    void checkAnagram_shouldReturnFalse_whenNumberOfLettersNotEqual() {
        String a = "abc";
        String b = "abcd";

        assertFalse(CompareWords.checkLettersAmount(a, b), "Words are not the same.");
    }
}