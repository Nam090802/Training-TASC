package StaticAndFinal;

import java.util.ArrayList;

final public class DemoFinal {
    final int a = 10;
    final int b;

    public DemoFinal(int b) {
        this.b = b;
    }

    final void display() {
        System.out.println("Phương thức không thể ghi đè");
        //biến kiểu object với từ khóa final có thể sửa đổi đưuọc trạng thái của nó
        final ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        for (int i : arr) {
            System.out.print("Danh sách: " + i + " ");
        }
    }

    // Không kế thừa được một lớp final
/*    public class Demo extends DemoFinal {
        public Demo(int b) {
            super(b);
        }
    }*/

}
