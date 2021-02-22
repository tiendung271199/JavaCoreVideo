package javacore.enums;

public class Enums2 {
	
	enum Day {
		MONDAY(5), TUESDAY(10), WEDNESDAY(15), THURSDAY(20), FRIDAY(25), SATURDAY(26), SUNDAY(27);

		private int value;

		// Khởi tạo giá trị cho hằng số enum
		private Day(int value) {
			this.value = value;
		}
		
	}
	
	public static void main(String[] args) {
		for (Day day : Day.values()) {
			System.out.println(day + " - " + day.value);
		}
	}
	
}
