import java.util.Scanner;

public class Program_3 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (n == arr[i]) {
				count = i;
				break;
			}
		}
		if (count > 0)
			System.out.println(count);
		else
			System.out.println("-1");
	}
}
