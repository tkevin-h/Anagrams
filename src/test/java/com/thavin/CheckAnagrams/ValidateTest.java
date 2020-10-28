package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidateTest {

    // Positive cases
    @Test
    void validateWord_shouldReturnTrue_whenInputIsLettersOnly() {
        String word = "abc";

        assertTrue(Validate.validateWord(word), "word contains letters only");
    }

    @Test
    void validateWord_shouldReturnFalse_whenInputContainsNumbers() {
        String word = "abc123";

        assertFalse(Validate.validateWord(word), "word contains numbers");
    }

    @Test
    void validateWord_shouldReturnFalse_whenInputContainsSpecialCharacters() {
        String word = "abc123#@%";

        assertFalse(Validate.validateWord(word), "word contains special characters");
    }

    @Test
    void validateWord_shouldReturnFalse_whenInputIsEmpty() {
        String word = "";
        String word2 = "     ";

        assertFalse(Validate.validateWord(word), "word is empty");
        assertFalse(Validate.validateWord(word2), "word is empty");
    }

    /*@Test
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
    }*/

    // Edge cases

    // Negative cases
}