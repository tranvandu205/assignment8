package assignment8;

public class SpaceRemover {

    public static String removeExtraSpaces(String str) {
        // Loại bỏ khoảng trắng ở đầu và cuối, sau đó thay thế nhiều khoảng trắng liên tiếp bằng một khoảng trắng
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String str = "   Hello    World   ";

        String result = removeExtraSpaces(str);
        System.out.println("Chuoi sau khi xoa khoang trang thua: \"" + result + "\"");
    }
}
