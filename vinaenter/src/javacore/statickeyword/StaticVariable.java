package javacore.statickeyword;

public class StaticVariable {
	int id;
	String name;
	static String college = "Đại Học Bách Khoa"; // chỉ sử dụng bộ nhớ 1 lần để lưu biến này, thuộc tính static trong java được chia sẻ với tất cả obj
	
	public StaticVariable(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(id + " - " + name + " - " + college);
	}
	
	public static void main(String[] args) {
		StaticVariable obj1 = new StaticVariable(1, "Dũng");
		StaticVariable obj2 = new StaticVariable(2, "Nam");
		obj1.display();
		obj2.display();
	}

}
