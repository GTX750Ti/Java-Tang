package January19;

public class 作业 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] bucket = new int[26];
        char ch;
        for (int i = 0; i < magazine.length(); ++i) {
            ++bucket[magazine.charAt(i) - 'a'];
        }
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (--bucket[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String[] args) {
//        System.out.println(canConstruct("aa", "aba"));

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
    }
}
