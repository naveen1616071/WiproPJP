import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int num1 = 6;
		int num2 = 7;
		int sum = 0;
		boolean flag = false;
		for (int i : arr) {
			if (i == num1) {
				flag = true;
			}
			if (flag == true) {
				if (i == num2) {
					flag = false;
				}
				continue;
			} else {
				if (i == 7) {
					sum += 6 + i;
				} else
					sum += i;
			}
		}
		System.out.println("sum is " + sum);

	}

}