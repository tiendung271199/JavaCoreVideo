package javacore.statickeyword;

public class StaticBlock {
	// khối static chạy trước phương thức main
	static {
		System.out.println("Đây là khối static");
	}
	
	public static void main(String[] args) {
		System.out.println("Đây là main");
	}
}
