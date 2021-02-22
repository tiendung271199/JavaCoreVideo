package javacore.thisandsuper;

// Sử dụng super()
class ClassCha2 {
	public ClassCha2() {
		System.out.println("Constructor lớp cha");
	}
}

public class SuperKeyWord2 extends ClassCha2 {
	public SuperKeyWord2() {
		super(); // nếu không sử dụng super() thì trình biên dịch sẽ cung cấp ngầm định super() cho constructor của lớp con
		System.out.println("Constructor lớp con");
	}
	
	public void display() {
		System.out.println("VD super()");
	}
	
	public static void main(String[] args) {
		SuperKeyWord2 obj = new SuperKeyWord2();
		obj.display();
	}

}
