package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class FindAnagramsTest {
    //Positive cases
    @Test
    public void find_shouldReturnSetOfAnagrams_whenWordIsAnagram() throws IOException {
        Set<String> words = new TreeSet<>();
        words.add("abc");
        words.add("acb");
        words.add("bac");
        words.add("bca");
        words.add("cba");
        words.add("cab");

        Set<String> wordCombinations = new TreeSet<>();
        wordCombinations.add("cab");

         assertEquals(wordCombinations, FindAnagrams.find(words));
    }

    @Test
    public void buildDictionary_shouldReturnSet_whenGivenFileName() throws IOException {
        Set<String> dictionary = new TreeSet<>();
        dictionary.add("abc");

        assertEquals(dictionary, FindAnagrams.buildDictionary("./resources/words.txt"));
    }
}