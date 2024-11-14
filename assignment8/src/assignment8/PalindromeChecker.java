package assignment8;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Kiểm tra nếu ký tự bên trái và bên phải không giống nhau
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println("Chuoi \"" + str1 + "\" la palindrome: " + isPalindrome(str1));
        System.out.println("Chuoi \"" + str2 + "\" la palindrome: " + isPalindrome(str2));
    }
}
