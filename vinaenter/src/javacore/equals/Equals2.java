package javacore.equals;

// ví dụ ghi đè phương thức equals
public class Equals2 {
	// Student có các thuộc tính: id, name, address, age
	private int id;
	private String name;
	private String address;
	private int age;
	
	public Equals2(int id, String name, String address, int age) {
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
		// kiểm tra obj có phải là instance của Equals2 không
		if (obj instanceof Equals2) {
			Equals2 e = (Equals2) obj;
			if (this.id == e.id && this.name.equals(e.name) && this.address.equals(e.address) && this.age == e.age) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Equals2 obj1 = new Equals2(1, "Dũng", "Hà Tĩnh", 21);
		Equals2 obj2 = new Equals2(1, "Dũng", "Hà Tĩnh", 21);
		Equals2 obj3 = new Equals2(2, "Nam", "Đà Nẵng", 22);
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1.equals(obj2)); // true
		System.out.println(obj1.equals(obj3)); // false
	}
}
