import java.util.Scanner;

public class Program_7 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if (ch >= 97 && ch <= 123)
			System.out.print(Character.toUpperCase(ch));
		else if (ch >= 65 && ch <= 96)
			System.out.println(Character.toLowerCase(ch));
	}
}
