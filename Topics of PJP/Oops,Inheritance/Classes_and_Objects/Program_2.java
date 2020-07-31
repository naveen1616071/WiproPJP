package Classes_and_Objects;

class Calculator {

	public static double powerInt(int num1, int num2) {
		return Math.pow(num1, num2);
	}

	public static double powerDouble(Double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

class BoxDemo {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.powerInt(2, 4));
		System.out.print(calculator.powerDouble(2.4, 4));

	}
}
