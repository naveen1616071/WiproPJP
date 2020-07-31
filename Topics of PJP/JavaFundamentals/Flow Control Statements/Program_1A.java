import java.util.Scanner;

public class Program_1A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		// int b=s.nextInt();
		if (a > 0)
			System.out.print("Positive");
		else if (a < 0)
			System.out.print("Negative");
		else
			System.out.print("Zero");
	}
}
