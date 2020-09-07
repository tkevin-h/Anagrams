package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompareWordsTest {

    // Positive cases
    @Test
    void checkAnagram_shouldBeTrue_whenWordsAreEqual() {
        String a = "abc";
        String b = "abc";

        assertTrue(CompareWords.checkAnagram(a, b), "Words are not the same.");
    }

    @Test
    void checkLettersAmount_shouldBeTrue_whenNumberOfLettersAreEqual() {
        String a = "abcd";
        String b = "bcda";

        assertTrue(CompareWords.checkLettersAmount(a, b), "Letters count are the not same.");
    }


    // Edge cases

    // Negative cases
}