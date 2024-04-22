package StaticAndFinal;

public class DemoStaticClass {
    static int a = 10;
    int b = 15;
    public static void display() {
        System.out.println("Giá trị ban đầu của a: " + a);
        //System.out.println("b = " + b); //Chỉ truy cập được biến static
    }
    void demo(){}

    static class NestedStaticClass {
        static void demo(){
            a = 20;
            System.out.println("Giá trị sau khi thay đổi của a: " + a);
            display();
        }
    }
}
