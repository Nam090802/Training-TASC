package Collection.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //thêm phần từ vào cuối danh sách
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1, 6);
        arrayList.size();
        arrayList.get(2);
        arrayList.indexOf(6);

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 2) {
                it.remove();
            }
        }

        System.out.println(arrayList);
    }
}
