package javacore.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {
	// Set là 1 danh sách không thể chứa các phần tử trùng lặp
	// Set được triển khai bởi HashSet
	// HashSet lưu trữ các phần tử của nó trong bảng băm, HashSet không đảm bảo về thứ tự các phần tử được chèn vào
	public static void display(Set<Integer> set) {
		// sử dụng foreach để hiển thị set
		if (set.size() > 0) {
			for (Integer integer : set) {
				System.out.println(integer);
			}
		} else {
			System.out.println("Không có phần tử");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(7);
		Set<Integer> set = new HashSet<Integer>();
		set.add(1); // Thêm phần tử vào set
		set.add(7);
		set.add(6);
		set.add(2);
		set.add(3);
		display(set);
		set.clear(); // Xoá hết phần tử trong set
		display(set);
		set.addAll(list); // Thêm toàn bộ phần tử của list vào set
		display(set);
		System.out.println(set); // hiển thị ra tất cả phần tử của set
		System.out.println(set.contains(12)); // kiểm tra set có chứa 12 không
		// sử dụng iterator để hiển thị set
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		set.remove(12); // xoá phần tử trong set
		display(set);
	}
}
