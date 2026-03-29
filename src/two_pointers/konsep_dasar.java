package two_pointers;

import java.util.Arrays;

public class konsep_dasar {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverseIntArr(arr)));
        String words = "abcde";
        System.out.println(reverseString(words));
    }

    public static int[] reverseIntArr(int[] arr) {
        int pointer_1 = 0;
        int pointer_2 = arr.length - 1;
        while (pointer_1 < pointer_2) {
            int temp = arr[pointer_1];
            arr[pointer_1] = arr[pointer_2];
            arr[pointer_2] = temp;
            pointer_1++;
            pointer_2--;
        }
        return arr;
    }

    public static String reverseString(String words) {
        char[] charArr = words.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
