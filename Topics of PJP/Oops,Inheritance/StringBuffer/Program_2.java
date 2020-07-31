package StringBuffer;
import java.util.Scanner;

class Program_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		StringBuffer sb = new StringBuffer(a);
		int l = a.length();
		if (a.charAt(l - 1) == b.charAt(0)) {
			String c = sb.deleteCharAt(a.length() - 1) + "" + b;
			System.out.print(c.toLowerCase());
		} else {
			String c = a + " " + b;
			System.out.print(c.toLowerCase());
		}
		sc.close();
	}
}
