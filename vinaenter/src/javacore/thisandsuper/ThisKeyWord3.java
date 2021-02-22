package javacore.thisandsuper;

public class ThisKeyWord3 {
	// gọi phương thức của lớp hiện tại
	public void method1() {
		System.out.println("Phương thức 1");
	}
	
	public void method2() {
		this.method1();
	}
	
	public void method3() {
		method2(); // trình biên dịch sẽ tự thêm this để gọi phương thức method(2) => this.method2()
	}
	
	public static void main(String[] args) {
		ThisKeyWord3 obj = new ThisKeyWord3();
		obj.method3();
	}

}
