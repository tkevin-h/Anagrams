package com.thavin.CheckAnagrams;

public class Validate {

    public static boolean validateWord(String word) {
        if(word.isBlank()) {
            return false;
        }

        return word.matches("[a-zA-Z]+");
    }

    /*public static boolean isEmpty(String word) {
        return word.isEmpty();
    }

    public static boolean containsNumbers(String word) {
        return word.matches("\\d+");
    }

    public static boolean containsSpecialCharacters(String word) {
        return word.matches("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
    }*/
}
