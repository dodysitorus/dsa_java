package sdetCoding;

public class coba2 {
    static void main() {
        int input = 1234;
        String temp = Integer.toString(input);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < temp.length(); i++) {
            String currentChar = String.valueOf(temp.charAt(i));
            if (currentChar.equals("1")) {
                currentChar = "one";
            } else if (currentChar.equals("3")) {
                currentChar = "three";
            }
            result.append(currentChar);
        }
        System.out.println(result);
    }
}
