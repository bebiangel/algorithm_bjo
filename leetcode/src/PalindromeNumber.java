import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    //
    public static void main(String[] args) {
        //
        int x = 123123;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        //
        if (x >= 0 && x < 10) return true;
        if (x < 0) return false;
        List<Integer> numbers = new ArrayList<>();
        while (x > 0) {
            numbers.add(x % 10);
            x = x / 10;
        }

        boolean isEqual = true;
        for (int i = 0; i < numbers.size() / 2; i++) {
            //
            System.out.println(numbers.get(i) + "," + (numbers.get(numbers.size() - i - 1)));
            if (numbers.get(i) == (numbers.get(numbers.size() - i - 1))) {
                isEqual = false;
            }
        }

        return isEqual;
    }
}
