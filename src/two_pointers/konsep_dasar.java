package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class konsep_dasar {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(reverseIntArr(arr)));
        String words = "katak";
        System.out.println(reverseString(words));
        System.out.println(isPalindrome(words));
        int[] input = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSumSortedArray(input, target));
        int[] number = {1, 0, 3, 0, 12};
        System.out.println(Arrays.toString(moveZeros(number)));
        int[] duplicateNumber = {1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(removeDuplicate(duplicateNumber)));
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

    public static boolean isPalindrome(String input) {
        char[] inputArr = input.toCharArray();

        int left = 0;
        int right = inputArr.length - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static ArrayList<Integer> twoSumSortedArray(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result.add(arr[left]);
                result.add(arr[right]);
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static int[] moveZeros(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }

        }
        return arr;
    }

//    int[] duplicateNumber = {1, 1, 2, 2, 3};
    public static int[] removeDuplicate(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        int uniqueCount = slow + 1;
        int[] result = new int[slow + 1];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
