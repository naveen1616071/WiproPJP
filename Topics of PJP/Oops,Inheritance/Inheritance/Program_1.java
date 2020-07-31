package Inheritance;

class Animal {
	void eat() {
		System.out.println("Animal eating...");
	}

	void sleep() {
		System.out.println("Animal sleeping...");
	}
}

class Bird extends Animal {
	void eat() {
		System.out.println("Bird eating...");
	}

	void sleep() {
		System.out.println("Bird sleeping...");
	}

	void fly() {
		System.out.println("Bird flying...");
	}
}

class Program_1 {
	public static void main(String args[]) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}
