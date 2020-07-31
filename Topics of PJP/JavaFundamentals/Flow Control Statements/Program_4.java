import java.util.Scanner;

public class Program_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char x = s.next().charAt(0);
		char y = s.next().charAt(0);
		if ((int) x > (int) y)
			System.out.print(y + "," + x);
		else if ((int) x < (int) y)
			System.out.print(x + "," + y);
	}
}
