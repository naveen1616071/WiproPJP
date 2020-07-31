package StringBuffer;
import java.util.Scanner;

class Program_5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int l = a.length();
		String b = a.substring(1, l - 1);
		System.out.print(b);
		s.close();
	}
}
