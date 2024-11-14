package assignment8;

import java.util.Arrays;

public class WordSplitter {

    public static String[] splitWords(String str) {
        // Sử dụng phương thức split() để tách các từ dựa trên dấu cách
        return str.split(" ");
    }

    public static void main(String[] args) {
        String str = "Java is fun";

        String[] words = splitWords(str);
        System.out.println("Mang cac tu: " + Arrays.toString(words));
    }
}
