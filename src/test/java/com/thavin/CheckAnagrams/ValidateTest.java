package com.thavin.CheckAnagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
    // Positive cases
    @Test
    void validateWord_shouldReturnTrue_whenInputIsLettersOnly() {
        String word = "abc";

        assertFalse(Validate.validateWord(word), "word does not contain letters only");
    }

    @Test
    void isEmpty_shouldReturnFalse_whenInputIsNotEmpty() {
        String word = "abc";

        assertFalse(Validate.isEmpty(word), "word is empty");
    }

    @Test
    void containsNumbers_shouldReturnFalse_whenInputHasNumbers() {
        String word = "abc123";

        assertFalse(Validate.containsNumbers(word), "word contains numbers");
    }

    @Test
    void containsSpecialCharacters_shouldReturnFalse_whenInputHasSpecialCharacters() {
        String word = "abc*";

        assertFalse(Validate.containsSpecialCharacters(word), "word contains special characters");
    }

    // Edge cases

    // Negative cases
}