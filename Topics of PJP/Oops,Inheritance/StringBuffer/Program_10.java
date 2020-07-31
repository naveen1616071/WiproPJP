package StringBuffer;

import java.util.Scanner;

class Program_10 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int n = s.nextInt();
		a = a.substring(a.length() - n);
		String str = "";
		for (int i = 0; i < n; i++)
			str = str + a;
		System.out.println(str);
		s.close();
	}
}
