package javacore.string;

public class StringBuffer1 {
	// Lớp StringBuffer dùng để tạo chuỗi có thể thay đổi, nó giống với String, chỉ khác ở chỗ là có thể thay đổi
	// StringBuilder tương tự lớp StringBuffer, chỉ khác chỗ là StringBuilder không đồng bộ
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		str.append("Java"); // nối chuỗi "Java" vào chuỗi str => chuỗi str thay đổi
		System.out.println(str); // Hello Java
		str.insert(2, "Java"); // chèn chuỗi "Java" vào vị trí thứ 2 của chuỗi str
		System.out.println(str); // HeJavallo Java
		str.replace(2, 7, "PHP"); // Thay thế chuỗi str từ vị trí thứ 2 đến 6 bằng chuỗi "PHP"
		System.out.println(str); // HePHPlo Java
		str.delete(2, 6); // Xoá chuỗi str từ vị trí thứ 2 đến 5
		System.out.println(str); // Heo Java
		str.reverse(); // đảo ngược chuỗi str
		System.out.println(str); // avaJ oeH
		System.out.println(str.capacity()); // dung lượng mặc định 16 + 6 = 22, 6 là độ dài của chuỗi mặc định ban đầu "Hello "
		str.append(" is my programming language");
		System.out.println(str.capacity()); // dung lượng 22 * 2 + 2 = 46
		StringBuffer str2 = new StringBuffer();
		System.out.println(str2.capacity()); // mặc định 16
		str2.append("Java is my programming language");
		System.out.println(str2.capacity()); // 16 * 2 + 2 = 34
	}
}
