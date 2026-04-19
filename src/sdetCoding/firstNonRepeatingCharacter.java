package sdetCoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    static void main() {
        String input = "pavan";
        char[] inputChar = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : inputChar){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
