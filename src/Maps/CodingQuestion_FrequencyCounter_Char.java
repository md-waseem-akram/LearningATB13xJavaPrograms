package Maps;

import java.util.*;

public class CodingQuestion_FrequencyCounter_Char {
    public static void main(String[] args) {
        String Input = "Programming";

        Map<Character, Integer> FreqMap = new HashMap<>();
        for (char c : Input.toCharArray()){
            FreqMap.put(c, FreqMap.getOrDefault(c,0)+1);
        }

        System.out.println(FreqMap);
    }
}
