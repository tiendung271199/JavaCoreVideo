package javacore.thisandsuper;

public class ThisKeyWord {
	int id;
	String name;
	
	public ThisKeyWord() {
		System.out.println("Constructor lớp hiện tại");
	}
	
	public ThisKeyWord(int id, String name) {
		// sử dụng this() để gọi constructor của lớp hiện tại, và this() phải được gọi đầu tiên ở trong constructor
		this();
		// this.id tham chiếu tới biến id của lớp hiện tại (biến id của lớp hiện tại khác với biến id truyền vào)
		// nếu không có this, chương trình sẽ ko hiểu đâu là biến id của lớp hiện tại, đâu là biến id truyền vào
		this.id = id;
		this.name = name;
		// this(); // error - this phải được sử dụng ở đầu tiên trong constructor
	}
	
	public void display() {
		System.out.println(id + " - " + name);
	}
	
	public static void main(String[] args) {
		ThisKeyWord obj1 = new ThisKeyWord(1, "Dũng");
		ThisKeyWord obj2 = new ThisKeyWord(2, "Nam");
		obj1.display();
		obj2.display();
	}

}
