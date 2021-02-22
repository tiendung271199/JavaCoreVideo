package javacore.enums;

public class Enums {
	
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static void main(String[] args) {
		System.out.println(Day.TUESDAY);
		
		// Duyệt các phần tử trong enum
		for (Day day : Day.values()) {
			System.out.println(day);
		}
	}
	
}
