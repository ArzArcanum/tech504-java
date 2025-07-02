package t08Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercises {
    public static HashSet<Integer> makeFiveSet(int max) {
        if (max > 0) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i <= max; i++) {
                if (i % 5 == 0) {
                    set.add(i);
                }
            }
            return set;
        }
        throw new IllegalArgumentException();
    }

    public static List<String> longWordList(String sentence) {
        List<String> list = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            if (word.length() >= 5) {
                list.add(word);
            }
        }
        return list;
    }

}
