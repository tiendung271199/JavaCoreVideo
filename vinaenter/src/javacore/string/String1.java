package javacore.string;

public class String1 {
	/*
	 *  Có thể tạo chuỗi ký tự trong java bằng cách sử dụng String, StringBuffer, StringBuilder
	 *  String không thể thay đổi, đối với chuỗi có thể thay đổi có thể sử dụng StringBuffer và StringBuilder
	 *  
	*/
	
	public static void main(String[] args) {
		// Tạo đối tượng string => có 2 cách
		// cách 1: sử dụng string literal
		String s1 = "Java";
		String s2 = "Java"; // có nghĩa s1 và s2 cùng tham chiếu đến chuỗi Java, sẽ không new đối tượng mới
		String s3 = "PHP";
		// cách 2: sử dụng từ khoá new
		String s4 = new String("PHP");
		// 1 số phương thức của lớp String
		String str = "Trung Tâm VinaEnter";
		System.out.println(str.charAt(3)); // trả về giá trị của ký tự tại vị trí thứ 3 => n
		System.out.println(str.length()); // trả về độ dài của chuỗi
		System.out.println(str.substring(12)); // trả về chuỗi con bắt đầu tử chỉ số 12 => naEnter
		System.out.println(str.substring(12, 15)); // trả về chuỗi con bắt đầu từ chỉ số 12 đến 14 => naE
		System.out.println(str.contains("Vina")); // kiểm tra chuỗi str có chứa chuỗi "Vina" không => true
		System.out.println(String.join(" ",str, "Đà", "Nẵng")); // trả về chuỗi được nối từ nhiều chuỗi => Trung Tâm VinaEnter Đà Nẵng
		System.out.println(str.replace('n', '3')); // thay thế ký tự 'n' bằng ký tự '3' => Tru3g Tâm Vi3aE3ter
		System.out.println(str.replace("Vina", "ABC")); // Thay thế chuỗi "Vina" bằng chuỗi "ABC" => Trung Tâm ABCEnter
		System.out.println(s1.equals(s2)); // so sánh chuỗi => true
		System.out.println(s3 == s4); // false => so sánh chuỗi không dùng toán tử == mà phải dùng equals
		String[] array = str.split("\\s"); // tách chuỗi str ngăn cách bởi khoảng trắng => return về mảng string
		for (String string : array) {
			System.out.print(string + "---");
		}
		System.out.println();
		System.out.println(str.indexOf('n')); // trả về vị trí của ký tự 'n' đầu tiên trong chuỗi => 3
		System.out.println(str.toLowerCase()); // trả về chuỗi chữ thường => trung tâm vinaenter
		System.out.println(str.toUpperCase()); // trả về chuỗi chữ hoa => TRUNG TÂM VINAENTER
		System.out.println(str.concat("Java")); // nối chuỗi "Java" vào chuỗi str
		str.concat("Java");
		System.out.println(str); // không thay đổi vì string là bất biến, không thể thay đổi
		System.out.println(str.startsWith("Trung")); // kiểm tra chuỗi str có bắt đầu bằng chuỗi "Trung" không => true
		System.out.println(str.endsWith("Enter3")); // kiểm tra chuỗi str có kết thúc bằng chuỗi "Enter3" không => false
		
	}
}
