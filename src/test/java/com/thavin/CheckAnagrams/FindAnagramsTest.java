package com.thavin.CheckAnagrams;

import static org.junit.jupiter.api.Assertions.*;

import com.sun.source.tree.Tree;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class FindAnagramsTest {
    //Positive cases
    @Test
    void find_shouldReturnArrayOfWords_whenWordIsAnagram() {
        Set<String> words = new TreeSet<>();
        words.add("abc");
        words.add("acb");
        words.add("bac");
        words.add("bca");
        words.add("cba");
        words.add("cab");

        String[] wordCombinations = new String[] {"cab"};

        //assertArrayEquals(wordCombinations, find(words));
    }

    @Test
    void buildDictionary_shouldReturnSet_whenGivenFileName() throws IOException {
        Set<String> dictionary = new TreeSet<>();
        dictionary.add("abc");

        assertEquals(dictionary, FindAnagrams.buildDictionary("test_words.txt"));
    }
}