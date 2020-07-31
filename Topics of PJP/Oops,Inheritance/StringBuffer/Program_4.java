package StringBuffer;
import java.util.Scanner;

class Program_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int l = a.length();
		if (l % 2 == 0) {
			String b = a.substring(0, l / 2);
			System.out.print(b);
		} else {
			System.out.print("null");
		}
		s.close();
	}
}
