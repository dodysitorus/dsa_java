package sdetCoding;

import java.util.HashSet;
import java.util.Set;

public class capGemini {
    static void main() {
        int[] input = {10,20,30,40,40,10};
        Set<Integer> result = new HashSet<>();
        for (Integer x : input){
            if (!result.add(x)){
                System.out.println(x);
            }
        }
    }
}
