package sdetCoding;

public class palindrome {
    static void main() {
        String input = "hello";
        char[] inputArr = input.toCharArray();

        int left = 0;
        int right = inputArr.length - 1;

        while (left < right) {
            char temp = inputArr[left];
            inputArr[left] = input.charAt(right);
            inputArr[right] = temp;
            left++;
            right--;
        }
        System.out.println(inputArr);
    }
}
