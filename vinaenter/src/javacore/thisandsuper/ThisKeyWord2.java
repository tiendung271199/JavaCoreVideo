package javacore.thisandsuper;

public class ThisKeyWord2 {
	// VD: sử dụng this() gọi constuctor của lớp hiện tại
	int id;
	String name;
	String address;
	
	public ThisKeyWord2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ThisKeyWord2(int id, String name, String address) {
		this(id, name); // sử dụng this() gọi constructor => không cần phải khởi tạo id và name
		this.address = address;
	}
	
	public void display() {
		System.out.println(id + " - " + name + " - " + address);
	}
	
	public static void main(String[] args) {
		ThisKeyWord2 obj1 = new ThisKeyWord2(1, "Dũng");
		ThisKeyWord2 obj2 = new ThisKeyWord2(2, "Nam", "Đà Nẵng");
		obj1.display(); // 1 - Dũng - null
		obj2.display(); // 2 - Nam - Đà Nẵng
	}
}
