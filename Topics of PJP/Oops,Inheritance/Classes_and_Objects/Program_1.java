package Classes_and_Objects;

class Box {
	double width;
	double height;
	double depth;

	Box(double width, double height, double depth) {
		System.out.println("Constructing Box");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width * height * depth;
	}
}

class Program_1 {
	public static void main(String args[]) {
		Box box = new Box(100, 200, 150);
		double vol;
		vol = box.volume();
		System.out.println("Volume of the box is " + vol);
	}
}
