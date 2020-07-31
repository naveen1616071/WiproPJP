package StringBuffer;

import java.util.Scanner;

class Program_9 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		int l = a.length();
		int l1 = b.length();
		if (l == l1) {
			for (int i = 0; i < l; i++) {
				System.out.print(a.charAt(i));
				System.out.print(b.charAt(i));
			}
		} else if (l > l1) {
			for (int i = 0; i < l1; i++) {
				System.out.print(a.charAt(i));
				System.out.print(b.charAt(i));
			}
			for (int i = l1; i < l; i++)
				System.out.print(a.charAt(i));
		} else if (l1 > l) {
			for (int i = 0; i < l; i++) {
				System.out.print(a.charAt(i));
				System.out.print(b.charAt(i));
			}
			for (int i = l; i < l1; i++)
				System.out.print(b.charAt(i));
		}
		s.close();
	}
}
