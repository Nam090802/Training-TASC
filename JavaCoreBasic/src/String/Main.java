package String;

public class Main {
    public static void main(String[] args) {
        String string = "Hello World!";
        String string1 = new String("Hello World!");
        String string2 = "Hello World!"; // String pool string
        //So sánh nội dung 2 chuỗi (obj)
        System.out.println("So sánh equals: " + string.equals(string2));
        //So sánh tham chiếu có trỏ cùng một vị trí không
        System.out.println("So sánh == literal: " + (string == string2));
        System.out.println("So sánh == non-literal: " + (string == string1));
    }
}
