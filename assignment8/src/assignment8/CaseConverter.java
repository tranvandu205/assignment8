package assignment8;

public class CaseConverter {

    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Kiểm tra nếu ký tự là chữ hoa, chuyển sang chữ thường
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } // Kiểm tra nếu ký tự là chữ thường, chuyển sang chữ hoa
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } // Nếu không phải chữ cái, giữ nguyên
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";

        String convertedStr = convertCase(str);
        System.out.println("Chuoi sau khi chuyen doi: \"" + convertedStr + "\"");
    }
}
