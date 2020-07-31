package Polymorphism;

class fruit {
	String name, taste, size;

	protected void eat() {
		System.out.println("Parent class method");
	}
}

class Apple extends fruit {
	public void eat() {
		System.out.println("NAME OF THE FRUIT IS APPLE ");
		System.out.println("ITS TASTE IS SWEET");
	}
}

class Orange extends fruit {
	public void eat() {
		System.out.println("NAME OF THE FRUIT IS ORANGE");
		System.out.println("ITS TASTE IS SOUR");
	}
}

class Program_1 {
	public static void main(String[] args) {
		Orange obj = new Orange();
		obj.eat();
		Apple obj1 = new Apple();
		obj1.eat();
	}
}