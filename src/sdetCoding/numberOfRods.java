package sdetCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class numberOfRods {
    static void main() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(1);
        input.add(3);
        input.add(4);
        List<Integer> result = new ArrayList<>();

        while (!input.isEmpty()){
            int rods = input.size();
            result.add(rods);

            List<Integer> arrTemp = new ArrayList<>();
            int minValue = Collections.min(input);

            for (Integer integer : input) {
                int index = integer - minValue;
                if (index != 0) {
                    arrTemp.add(index);
                }
            }
            input=arrTemp;
       }
        System.out.println(result);
    }
}
