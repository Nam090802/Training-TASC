package StaticAndFinal;

public class Main {

    public static void main(String[] args) {
        DemoStaticClass demoStaticClass = new DemoStaticClass();
        DemoStaticClass.NestedStaticClass.demo();
        DemoFinal demoFinal = new DemoFinal(2);
        demoFinal.display();
    }
}
