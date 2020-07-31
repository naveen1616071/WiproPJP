import java.util.Scanner;

public class Program_1B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if ((a % 10) == (b % 10))
			System.out.print("true");
		else
			System.out.print("false");
	}
}
