package StringBuffer;

import java.util.Scanner;

class Program_7 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		if (a.charAt(0) == 'x')
			a = a.substring(1);
		if (a.charAt(a.length() - 1) == 'x')
			a = a.substring(0, a.length() - 1);
		System.out.println(a);
		s.close();
	}
}
