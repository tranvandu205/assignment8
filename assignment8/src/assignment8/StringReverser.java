package assignment8;

public class StringReverser {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";

        String reversedStr = reverseString(str);
        System.out.println("Chuoi dao nguoc cua \"" + str + "\" la \"" + reversedStr + "\".");
    }
}
