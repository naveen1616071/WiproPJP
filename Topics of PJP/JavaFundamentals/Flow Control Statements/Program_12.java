import java.util.Scanner;

public class Program_12 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1)
			System.out.print("not prime number");
		else {
			for (a = 2; a <= m; a++) {
				if (n % a == 0) {
					System.out.println("not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("prime number");
		}
	}
}
