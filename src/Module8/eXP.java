package Module8;

import java.util.HashMap;
import java.util.Map;

public class eXP {

    private static Map<Character, Integer> constructFrequencyMap(char[] chars) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch: chars) {
            if (!freq.containsKey(ch)) {
                freq.put(ch, 0);
            }
            freq.put(ch, freq.get(ch) + 1);
        }

        return freq;
    }

    private static int countOccurrences(Map<Character, Integer> freq, char ch) {
        return freq.get(ch);
    }

    public static void main(String[] args)
    {
        String str = "ABAACBDDT";
        char ch = 'A';
        char ch1 = 'T';

        Map<Character, Integer> freq = constructFrequencyMap(str.toCharArray());
        System.out.println("Character Peanuts " + ch + " occurs " +
                countOccurrences(freq, ch) + " times.");
        System.out.print("Aaron Has sold his Tank " + ch + " occurs " + countOccurrences(freq, ch) +
                " times. While " + ch1 + " has been mentioned " + countOccurrences(freq, ch1) + " That many times");
    }
}
