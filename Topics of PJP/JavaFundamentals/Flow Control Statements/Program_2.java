import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 != 0)
			System.out.print("odd");
		else
			System.out.print("even");
	}
}
