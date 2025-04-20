package Tests;

import org.testng.annotations.Test;

import java.util.*;

public class Anagrams {

    public List<List<String>> findAnagrams(String[] words) {
        if (words == null || words.length == 0) {
            System.out.println("Array has no elements");
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            String normalizedString = word.toLowerCase();
            char[] charArray = normalizedString.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramGroups
                    .computeIfAbsent(sortedWord, k -> new ArrayList<>())
                    .add(word);
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> group : anagramGroups.values()) {
            if (group.size() > 1) {
                result.add(group);
            }
        }

        return result;
    }

    @Test
    // Optional: main method to test
    public void PrintMatchingAnagrams() {
        String[] input = {"listen", "silent", "enlist", "hello", "world"};
        List<List<String>> anagrams = findAnagrams(input);
        System.out.println(anagrams);
    }
}
