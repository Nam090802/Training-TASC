package Collection.MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Map
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - Thêm các cặp key-value vào map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Original map: " + map);

        // 2. get(Object key) - Trả về giá trị của key được chỉ định
        System.out.println("Value of key 'two': " + map.get("two"));

        // 3. remove(Object key) - Xóa cặp key-value dựa trên key
        map.remove("one");
        System.out.println("Map after removing key 'one': " + map);

        // 4. containsKey(Object key) - Kiểm tra xem map có chứa key này không
        System.out.println("Does map contain key 'three'? " + map.containsKey("three"));

        // 5. containsValue(Object value) - Kiểm tra xem map có chứa giá trị này không
        System.out.println("Does map contain value 2? " + map.containsValue(2));

        // 6. size() - Trả về số lượng cặp key-value trong map
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty() - Kiểm tra xem map có rỗng không
        System.out.println("Is map empty? " + map.isEmpty());

        // 8. keySet() - Trả về một Set chứa tất cả các key từ map
        Set<String> keys = map.keySet();
        System.out.println("Key set: " + keys);

        // 9. values() - Trả về một Collection chứa tất cả các giá trị từ map
        Collection<Integer> values = map.values();
        System.out.println("Values collection: " + values);

        // 10. clear() - Xóa tất cả các cặp key-value khỏi map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}