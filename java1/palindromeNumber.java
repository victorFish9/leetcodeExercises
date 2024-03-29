public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 10;
        boolean reversedNumber = isPalindrome(number);
        System.out.println(reversedNumber);
    }
}