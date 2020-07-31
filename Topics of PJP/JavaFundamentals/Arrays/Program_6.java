import java.util.Arrays;

public class Program_6 {
	public static void main(String[] args) {
		int arr[] = { 65, 120, 98, 75, 115 };
		Arrays.sort(arr);
		for (int j = 0; j < arr.length - 1; j++)
			System.out.print(arr[j] + ",");
		System.out.print(arr[arr.length - 1]);
	}
}
