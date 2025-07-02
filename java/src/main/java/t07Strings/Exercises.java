package t07Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {
    public static int countWords(ArrayList<String> words, char character){
        int count = 0;
        for (String word: words){
            if (word.toLowerCase().startsWith(Character.toLowerCase(character)+"")){
                count++;
            }
        }
        return count;
    }

    public static int countWordsInString(String words, char character){
        String[] wordsList = words.split("\\s+");
        ArrayList<String> wordsListInString = new ArrayList<String>(Arrays.asList(words.split("\\s+")));
        return countWords(wordsListInString, character);
    }

    public static String transString(String sInput, int iInput){
        String inputWord = sInput.trim().toUpperCase();
        String numberString = "";
        for (int i = 0; i < iInput; i++){
            numberString = numberString + i;
        }
        return inputWord + numberString;
    }

    public static boolean isPalindrome(String input){
        if (input.isEmpty()) return false;
        input = input.toLowerCase();
        for (int i = 0; i <= input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
