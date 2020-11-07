package com.thavin.CheckAnagrams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindAnagrams {
    public static Set<String> find(Set<String> combinations) throws IOException {
        Set<String> dictionary = buildDictionary("./resources/words.txt");

        if(dictionary.retainAll(combinations)) {
            return dictionary;
        } else {
            return null;
        }
    }

    public static Set<String> buildDictionary(String fileName) throws IOException {
        BufferedReader dictionary = new BufferedReader(new FileReader(fileName));
        Set<String> words = new TreeSet<>();

        String word;

        while((word = dictionary.readLine()) != null) {
            words.add(word);
        }
        dictionary.close();

        return words;
    }
}
