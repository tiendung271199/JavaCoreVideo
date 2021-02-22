package javacore.statickeyword;

public class StaticVariable2 {
	// int stt = 0; // biến này sẽ lấy bộ nhớ mỗi khi new 1 đối tượng
	static int stt = 0; // biến static chỉ lấy bộ nhớ 1 lần duy nhất
	
	public StaticVariable2() {
		stt++;
	}
	
	public void display() {
		System.out.println(stt);
	}
	
	public static void main(String[] args) {
		StaticVariable2 obj1 = new StaticVariable2();
		obj1.display();
		StaticVariable2 obj2 = new StaticVariable2();
		obj2.display();
		StaticVariable2 obj3 = new StaticVariable2();
		obj3.display();
	}

}
