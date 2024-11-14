package assignment8;

public class CharacterCounter {

    public static int countOccurrences(String str, char ch) {
        int count = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            // Kiểm tra nếu ký tự hiện tại trùng với ký tự cần đếm
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';

        int occurrences = countOccurrences(str, ch);
        System.out.println("Ky tu '" + ch + "' xuat hien " + occurrences + " lan trong chuoi \"" + str + "\".");
    }
}
