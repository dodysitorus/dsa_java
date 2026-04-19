package sdetCoding;

import java.util.*;

public class findDuplicateName {
    static void main() {
        String[] input = {"Lucas", "Sergii", "Valerie", "Bob", "Lucas", "Sergii", "Lucas", "Jhon"};
        Set<String> set = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String name : input) {
            if (!set.add(name)) {
                duplicate.add(name);
            }
        }
        System.out.println(duplicate);

        Map<String,Integer> map = new HashMap<>();
        for (String name : input){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }
    }
}
