import java.util.Arrays;

public class Program_9 {
	public static void main(String[] args) {
		int arr[] = { 10,2, 10 };
		int index = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 10)
				arr[index++] = arr[i];
		int brr[] = Arrays.copyOf(arr, index);
		for (int i = 0; i < brr.length; i++)
			System.out.print(brr[i] + ",");
		for (int i = brr.length; i < arr.length - 1; i++)
			System.out.print("0,");
		System.out.print("0");
	}
}
