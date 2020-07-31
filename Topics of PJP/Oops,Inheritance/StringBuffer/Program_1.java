package StringBuffer;

import java.util.Scanner;

class palindrom {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		StringBuffer s = new StringBuffer(s1);
		String s2 = s.reverse().toString();
		if (s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
		sc.close();
	}
}
