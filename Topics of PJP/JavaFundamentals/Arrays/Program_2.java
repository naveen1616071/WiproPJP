public class Program_2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int max, min;
		min = max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		System.out.println(min);
	}
}
