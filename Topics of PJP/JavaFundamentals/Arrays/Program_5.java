import java.util.Arrays;

public class Program_5 {
	public static void main(String[] args) {
		int arr[] = { 65, 120, 98, 75, 115 };
		Arrays.sort(arr);
		int length = arr.length;
		System.out.println("Smallest two numbers " + arr[0] + " " + arr[1]);
		System.out.println("Largest two numbers " + arr[length - 1] + " " + arr[length - 2]);
	}
}
