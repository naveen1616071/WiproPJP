import java.util.Scanner;

public class Program_17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		String str = "";
		while (n > 0) {
			str += n % 10;
			n = n / 10;
		}
		if (str.equals(s))
			System.out.print(s + " is a palindrome");
		else
			System.out.print(s + " is not a palindrome");
	}
}
