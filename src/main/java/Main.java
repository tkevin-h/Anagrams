import com.thavin.CheckAnagrams.CompareWords;
import com.thavin.CheckAnagrams.Sort;
import com.thavin.CheckAnagrams.Validate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        String wordOne;
        String wordTwo;

        System.out.print("Type first word (letters only): ");
        wordOne = wordInput.nextLine().toLowerCase();
        Sort.findCombinations(wordOne);

        /*do {
            System.out.print("Type first word (letters only): ");
            wordOne = wordInput.nextLine().toLowerCase();
        } while (!Validate.validateWord(wordOne));

        do {
            System.out.print("Type second word (letters only): ");
            wordTwo = wordInput.nextLine().toLowerCase();
        } while (!Validate.validateWord(wordTwo));

        if(CompareWords.checkAnagram(wordOne, wordTwo)) {
            System.out.print("These words are anagrams");
        } else {
            System.out.print("These words are not anagrams");
        }*/
    }
}
