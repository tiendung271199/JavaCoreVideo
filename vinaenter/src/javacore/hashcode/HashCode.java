package javacore.hashcode;

import java.util.HashSet;
import java.util.Set;

// phương thức hashcode trả về giá trị của mã băm
public class HashCode {
	private int id;
	private String name;
	private String address;
	private int age;
	
	public HashCode(int id) {
		this.id = id;
	}
	
	public HashCode(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String toString() {
		return "Student: " + this.id + " - " + this.name + " - " + this.address + " - " + this.age;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof HashCode) {
			HashCode e = (HashCode) obj;
			if (this.id == e.id) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return Integer.toString(this.id).hashCode();
	}

	public static void main(String[] args) {
		HashCode obj1 = new HashCode(123, "Dũng", "Đà Nẵng", 21);
		HashCode obj2 = new HashCode(123, "Dũng", "Đà Nẵng", 21);
		HashCode obj3 = new HashCode(456, "Lan", "Quảng Trị", 20);
		Set<HashCode> set = new HashSet<HashCode>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		
		for (HashCode hashCode : set) {
			System.out.println(hashCode);
		}
		
		HashCode search = new HashCode(2);
		boolean found = set.contains(search);
		System.out.println("Search result: " + found);
	}
}
