package javacore.abstractclass;

// lớp abstract
abstract class Animal {
	abstract void run(); // phương thức abstract
}

class Dog extends Animal {
	void run() {
		System.out.println("Class Dog");
	}
}

class Cat extends Animal {
	void run() {
		System.out.println("Class Cat");
	}
}

public class AbstractClass extends Animal {
	void run() {
		System.out.println("Override phương thức abstract");
	}
	
	public static void main(String[] args) {
		Animal obj1 = new AbstractClass();
		obj1.run();
		Animal obj2 = new Dog();
		obj2.run();
		Animal obj3 = new Cat();
		obj3.run();
	}
	
}
