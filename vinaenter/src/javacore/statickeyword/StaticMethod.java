package javacore.statickeyword;

public class StaticMethod {
	int id; // biến non-static
	String name;
	static String college = "Đại Học Bách Khoa";
	
	public static void changeCollege() {
		college = "Đại Học Sư Phạm"; // phương thức static có thể truy cập đến biến static và thay đổi giá trị của nó
	}
	
	public StaticMethod(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id + " - " + name + " - " + college);
	}
	
	public static void main(String[] args) {
		StaticMethod.changeCollege(); // có thể gọi phương thức static mà không cần phải khởi tạo đối tượng
		
		StaticMethod obj1 = new StaticMethod(1, "Dũng");
		StaticMethod obj2 = new StaticMethod(2, "Nam");
		obj1.display();
		obj2.display();
		
		// System.out.println(id); // Phương thức static không thể sử dụng biến non-static
		// display(); // Phương thức static không thể gọi trực tiếp phương thức non-static
	}

}
