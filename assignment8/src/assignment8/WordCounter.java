package assignment8;

public class WordCounter {

    public static int countWords(String str) {
        // Loại bỏ khoảng trắng ở đầu và cuối chuỗi và tách chuỗi thành các từ
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is fun";

        int wordCount = countWords(str);
        System.out.println("Số lượng từ trong chuỗi \"" + str + "\" là: " + wordCount);
    }
}
