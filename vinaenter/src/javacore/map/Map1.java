package javacore.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
	// Map được sử dụng để lưu trữ dữ liệu theo cặp key và value
	// Map chỉ chứa các giá trị key duy nhất
	// Mỗi cặp key và value được gọi là entry
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java"); // Thêm phần tử vào map
		map.put(2, "PHP");
		map.put(3, "Java");
		map.put(2, "C++"); // key là duy nhất => thay PHP bằng C++ => cập nhật giá trị của phần tử trong map
		// Hiển thị map sử dụng keySet
		Set<Integer> set = map.keySet(); // return về set có chứa tất cả các key trong map
		for (Integer key : set) {
			System.out.println(key + " - " + map.get(key)); // phương thức get return về giá trị cho key được chỉ định
		}
		// Hiển thị map sử dụng Map.Entry
		// Entry là 1 interface con của map, nó có 2 phương thức là getKey và getValue để truy xuất dữ liệu
		// phương thức entrySet return về set chứa tất cả các key và value trong map
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
		// Hiển thị map sử dụng iterator
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer + " - " + map.get(integer));
		}
		System.out.println(map.get(2)); // return về value của key được chỉ định
		System.out.println(map); // hiển thị tất cả phần tử trong map
		System.out.println(map.size()); // số lượng phần tử trong map
		map.clear(); // xoá hết phần tử trong map
		System.out.println(map.size());
	}
}
