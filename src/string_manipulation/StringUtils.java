package string_manipulation;

import java.util.*;

public class StringUtils {
    public static void main(String[] args) {
//        System.out.println(countVowels("Hello World"));
//        System.out.println(reverse("hello"));
//        System.out.println(reverseWords("Tree is beautiful"));
//        System.out.println(isRotations("ABCD", "DBCA"));
//        System.out.println(removeDuplicates("Trees are beautiful"));
//        System.out.println(getMaxOccuringChar("Trees are beautifulbbbb"));
//        System.out.println(capitalize("today is a great day"));
//        System.out.println(areAnagrams("ABCD", "DBCAA"));
        System.out.println(isPalindrome("madame"));
    }

    public static boolean isPalindrome(String word){
        if (word == null){
            return false;
        }
//        StringBuilder input = new StringBuilder(word);
//        input.reverse();
//        return word.equals(input.toString());
//        return word.equals(reverse(word));
        int left = 0;
        int right = word.length() -1;
        while (left < right){
            if (word.charAt(left++) != word.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static boolean areAnagram(String first, String second){
        if (first == null || second == null || first.length() != second.length()){
            return false;
        }
        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];
        first = first.toLowerCase();
        for (int i = 0; i < first.length(); i++) {
            frequencies[first.charAt(i) - 'a']++;
        }
        second = second.toLowerCase();
        for (int i = 0; i < second.length(); i++) {
            int index = second.charAt(i) - 'a';
            if(frequencies[index] == 0){
                return false;
            }
            frequencies[index]--;
        }
        return true;
    }
    public static boolean areAnagrams(String first, String second){
        if (first == null || second == null || first.length() != second.length()){
            return false;
        }
        char[] array1 = first.toCharArray();
        Arrays.sort(array1);
        char[] array2 = second.toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static String capitalize(String sentence){
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }
        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public static char getMaxOccuringChar(String str) {
        if ( str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (frequencies.containsKey(ch)) {
                frequencies.replace(ch, frequencies.get(ch) + 1);
            } else {
                frequencies.put(ch, 1);
            }
        }
        int max = 0;
        char result = ' ';
        for (char ch : frequencies.keySet()) {
            if (frequencies.get(ch) > max) {
                max = frequencies.get(ch);
                result = ch;
            }
        }
        return result;
    }

    public static String removeDuplicates(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static boolean isRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return (str1.length() == str2.length()) &&
                ((str1 + str2).contains(str2));
    }

    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return "";
        }
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
//        StringBuilder reverseSentence = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reverseSentence.append(words[i] + " ");
//        }
//        return reverseSentence.toString().trim();
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiou";
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

}
