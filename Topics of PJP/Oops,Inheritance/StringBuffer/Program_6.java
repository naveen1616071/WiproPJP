package StringBuffer;
import java.util.Scanner;

class Program_6 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		int l = a.length();
		int l1 = b.length();
		if (l > l1)
			System.out.print(b + "" + a + "" + b);
		else
			System.out.print(a + "" + b + "" + a);
		s.close();
	}
}
