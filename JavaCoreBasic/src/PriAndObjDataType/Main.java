package PriAndObjDataType;

public class Main {
    public static void main(String[] args) {

        boolean isLearn = true;
        char character = 'A';

        //Lưu trữ một số nguyên rất nhỏ từ -128 đến 127 (8-bit).
        byte number = 127;
        //Lưu trữ một số nguyên nhỏ từ -32,768 đến 32,767 (16-bit).
        short number2 = 30000;
        //Lưu trữ một số nguyên từ -2^31 đến 2^31-1 (32-bit).
        int number3 = 40000;
        //Lưu trữ một số nguyên lớn từ -2^63 đến 2^63-1 (64-bit).
        long number4 = 5000000;
        //Lưu trữ một số thực. Số thực này là số thực dấu phẩy động đơn chính xác (32-bit).
        //cung cấp khoảng 7 chữ số thập phân chính xác
        float number5 = 6.8f;
        //Lưu trữ một số thực dấu phẩy động kép chính xác (64-bit).
        //cung cấp khoảng 15-17 chữ số thập phân chính xác
        double PI = 3.14;

        Integer integer = Integer.valueOf(4);
        Integer autoBoxingInteger = 4; //Auto boxing

        int n = 4;
        Integer nBoxing = n;
        System.out.println("Boxing n: " + nBoxing);
        System.out.println(n == nBoxing);

        Integer aUnBoxing = Integer.valueOf(10);
        int a = aUnBoxing;
        System.out.println("UnBoxing a: " + aUnBoxing);
        System.out.println("So sánh 2 đối tượng: " + aUnBoxing.equals(nBoxing));

        Student student = new Student("Nam", 22);
    }
}
