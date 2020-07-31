package StringBuffer;
import java.util.Scanner;

class Program_3 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = a.substring(0, 2);
		for (int i = 0; i < a.length(); i++) {
			System.out.print(b);
		}
		s.close();
	}
}
