package com.thavin.CheckAnagrams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FindAnagrams {
    public static String[] find(Set<String> combinations) throws IOException {
        BufferedReader dictionary = new BufferedReader(new FileReader("words.txt"));
        List<String> words = new ArrayList<>();

        String word;

        while((word = dictionary.readLine()) != null) {
            words.add(word);
        }
        dictionary.close();


    }

    public static List<String> dictionary(String fileName) throws IOException {
        BufferedReader dictionary = new BufferedReader(new FileReader(fileName));
        List<String> words = new ArrayList<>();

        String word;

        while((word = dictionary.readLine()) != null) {
            words.add(word);
        }
        dictionary.close();

        return words;
    }
}
