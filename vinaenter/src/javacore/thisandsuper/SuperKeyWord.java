package javacore.thisandsuper;

//super sử dụng để tham chiếu trực tiếp đến biến của lớp cha
class ClassCha {
	int x = 5;
}

public class SuperKeyWord extends ClassCha {
	int x = 10;
	
	public void display() {
		System.out.println(x); // x = 10
		System.out.println(super.x); // tham chiếu đến biến x của lớp cha => x = 5
	}
	
	public static void main(String[] args) {
		SuperKeyWord obj = new SuperKeyWord();
		obj.display();
	}
}
