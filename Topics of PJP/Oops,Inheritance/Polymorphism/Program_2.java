package Polymorphism;

class shape {
	void draw() {
		System.out.println("Drawing Shape");
	}

	void erase() {
		System.out.println("Erasing shape");
	}
}

class Circle extends shape {
	void draw() {
		System.out.println("Drawing Circle");
	}

	void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}

	void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends shape {
	void draw() {
		System.out.println("Drawing Square");
	}

	void erase() {
		System.out.println("Erasing Square");
	}
}

public class Program_2 {
	public static void main(String args[]) {
		shape c = new Circle();
		shape t = new Triangle();
		shape s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}
