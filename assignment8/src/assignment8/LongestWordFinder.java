package assignment8;

public class LongestWordFinder {

    public static String findLongestWord(String str) {
        // Tách chuỗi thành các từ
        String[] words = str.split("\\s+");

        // Khởi tạo biến để lưu từ dài nhất
        String longestWord = "";

        // Duyệt qua các từ và tìm từ dài nhất
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String str = "I love programming";

        String longestWord = findLongestWord(str);
        System.out.println("Tu dai nhat trong chuoi \"" + str + "\" la: \"" + longestWord + "\"");
    }
}
