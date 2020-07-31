package StringBuffer;

import java.util.Scanner;

class Program_8 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int l = a.length();
		int i, x = 0;
		for (i = 0; i < l; i++) {
			if (a.charAt(i) == '*')
				x = i;
		}
		System.out.print(a.substring(0, x - 1) + "" + a.substring(x + 2, l));
		s.close();
	}
}
