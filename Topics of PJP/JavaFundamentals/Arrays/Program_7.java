import java.util.Arrays;

public class Program_7 {
	public static void main(String[] args) {
		int arr[] = { 65, 120, 98, 65, 75, 115, 120, 75 };
		int count = 0;
		int n = arr.length;
		Arrays.sort(arr);
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++)
			System.out.print(temp[i] + " ");
	}
}
