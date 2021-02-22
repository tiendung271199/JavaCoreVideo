package javacore.statickeyword;

public class StaticKeyWord {
	// biến static
	static int x = 5;
	
	// khối static
	static {
		System.out.println("Đây là khối static");
	}
	
	// phương thức static
	static void get() {
		x = 15;
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		get();
		System.out.println(x);
	}

}
