package javacore.equals;

public class Equals {
	public static void main(String[] args) {
		// equals và toán tử == là khác nhau
		// equals so sánh 2 đối tượng về mặt ngữ nghĩa, ví dụ như s1 và s2 equals sẽ so sánh nội dung của string "Vinaenter"
		// toán tử == so sánh 2 đối tượng bằng cách so sánh các tham chiếu, hay là địa chỉ bộ nhớ của đối tượng
		String s1 = new String("Vinaenter");
		String s2 = new String("Vinaenter");
		System.out.println(s1 == s2); // s1 và s2 là 2 đối tượng khác nhau, được lưu trữ tại 2 vị trí khác nhau trong bộ nhớ => false
		System.out.println(s1.equals(s2)); // equals so sánh về mặt ngữ nghĩa => true
	}
}
