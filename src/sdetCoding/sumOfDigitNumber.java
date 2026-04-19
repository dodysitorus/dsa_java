package sdetCoding;

public class sumOfDigitNumber {
    static void main() {
        int input = 1234;
        int sum = 0;
        while (input != 0) {
            int digit = input % 10;
            sum += digit;
            input = input / 10;
        }
        System.out.println(sum);
    }
}
