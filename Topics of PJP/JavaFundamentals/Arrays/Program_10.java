import java.util.Arrays;

public class Program_10 {
	public static void main(String[] args) {
		int arr[] = { 0, 2, 0, 5, 7 };
		Arrays.sort(arr);
		int brr[] = new int[arr.length];
		int crr[] = new int[arr.length];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 || arr[i] % 2 == 0) {
				brr[j] = arr[i];
				j++;
			} else {
				crr[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i < j; i++)
			System.out.print(brr[i] + ",");
		for (int i = 0; i < k - 1; i++)
			System.out.print(crr[i] + ",");
		System.out.print(crr[k - 1]);
	}
}
