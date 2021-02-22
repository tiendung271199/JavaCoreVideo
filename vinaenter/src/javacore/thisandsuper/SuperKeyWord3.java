package javacore.thisandsuper;

// sử dụng super gọi trực tiếp phương thức của lớp cha
class ClassCha3 {
	public void message() {
		System.out.println("Message lớp cha");
	}
	
	public void abc() {
		System.out.println("Phương thức không có ở lớp con");
	}
}

public class SuperKeyWord3 extends ClassCha3 {
	public void message() {
		System.out.println("Message lớp con");
	}
	
	public void display() {
		message(); // gọi phương thức message() của lớp hiện tại (lớp con) - Nếu gọi message() thì phương thức message() của lớp con sẽ được thực thi
		super.message(); // gọi phương thức message() của lớp cha
		abc(); // trong trường hợp không có phương thức ở lớp con giống lớp cha thì không cần phải sử dụng super
	}
	
	public static void main(String[] args) {
		SuperKeyWord3 obj = new SuperKeyWord3();
		obj.display();
	}

}
