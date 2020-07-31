public class Program_12 {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2 };
		int brr[] = { 1, 5, 7 };
		int crr[] = new int[2];
		crr[0] = arr[1];
		crr[1] = brr[1];
		System.out.print(crr[0] + "," + crr[1]);
	}
}
