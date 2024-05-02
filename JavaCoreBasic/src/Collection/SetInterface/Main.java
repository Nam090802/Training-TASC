package Collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Tạo Set đầu tiên chứa các số
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // In Set đầu tiên
        System.out.println("Set1: " + set1);

        // Tạo Set thứ hai chứa một số phần tử chung và một số phần tử mới
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // In Set thứ hai
        System.out.println("Set2: " + set2);

        // Gộp Set thứ hai vào Set đầu tiên
        set1.addAll(set2);

        // In Set sau khi gộp
        System.out.println("Set1 sau khi thêm tất cả từ Set2: " + set1);

        if (set1.contains(2)) {
            System.out.println("Set 1 chứa phần tử 2");
        }
    }
}
