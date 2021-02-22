package javacore.equals;

import java.util.ArrayList;
import java.util.List;

// ví dụ ghi đè phương thức equals
public class Equals3 {
	// Student có các thuộc tính: id, name, address, age
	private int id;
	private String name;
	private String address;
	private int age;
	
	public Equals3(int id) {
		this.id = id;
	}
	
	public Equals3(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String toString() {
		return "Student: " + this.id + " - " + this.name + " - " + this.address + " - " + this.age;
	}

	// ghi đè lại phương thức equals
	public boolean equals(Object obj) {
		if (obj instanceof Equals3) {
			Equals3 e = (Equals3) obj;
			// chỉ so sánh id với nhau, nếu id = nhau => đối tượng giống nhau
			if (this.id == e.id) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Equals3 obj1 = new Equals3(1, "Dũng", "Hà Tĩnh", 21);
		Equals3 obj2 = new Equals3(1, "Dũng", "Hà Tĩnh", 21);
		Equals3 obj3 = new Equals3(2, "Nam", "Đà Nẵng", 22);
		
		List<Equals3> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		// khởi tạo 2 đối tượng chỉ có id, chỉ so sánh id
		Equals3 obj4 = new Equals3(1);
		Equals3 obj5 = new Equals3(3);
		
		// phương thức contains của List được sử dụng để kiểm tra nếu đối tượng truyền vào có trong List
		// và phương thức equals sẽ được gọi tự động ở trong phương thức contains
		System.out.println(list.contains(obj4)); // true (nếu xoá phương thức equals được ghi đè => kết quả sẽ là false)
		System.out.println(list.contains(obj5)); // false
		
	}
}
