package sdetCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupingMap {
    static void main() {
        String[] input = {"apple", "bat", "banana", "cat", "dog", "orange", "watermelon", "cucumber"};

        Map<Integer, List<String>> group = new HashMap<>();

        for (String s : input) {
            int count = s.length();
            if (!group.containsKey(count)){
                group.put(count, new ArrayList<>());
            }
            group.get(count).add(s);
        }

        System.out.println(group);

        for (Map.Entry<Integer, List<String>> entry: group.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
