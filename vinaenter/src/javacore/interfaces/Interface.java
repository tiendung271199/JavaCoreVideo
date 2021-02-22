package javacore.interfaces;

interface Test1 {
	void print();
}

interface Test2 {
	void view();
}

public class Interface implements Test1, Test2 {

	public void print() {
		System.out.println("Interface 1");
	}

	public void view() {
		System.out.println("Interface 2");
	}
	
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.print();
		obj.view();
	}

}
