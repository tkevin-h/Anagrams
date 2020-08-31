package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompareWordsTest {

    @Test
    public void words_are_equal() {
        CompareWords words = new CompareWords();
        String a = "a";
        String b = "a";

        assertTrue(words.checkAnagram(a, b), "Words are not the same.");
    }

    @Test
    public void number_of_letters_unequal() {
        CompareWords words = new CompareWords();
        String a = "a";
        String b = "ab";

        assertFalse(words.checkLettersAmount(a, b), "Letters count are the same.");
    }
}