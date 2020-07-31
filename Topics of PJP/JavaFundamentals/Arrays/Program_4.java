public class Program_4 {
	public static void main(String[] args) {
		int arr[] = { 65, 120, 98, 75, 115 };
		String str = null;
		for (int j = 0; j < arr.length; j++) {
			int i = arr[j];
			str = Character.toString((char) i);
			System.out.print(str + " ");
		}
	}
}
