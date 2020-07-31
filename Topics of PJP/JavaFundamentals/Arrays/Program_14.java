public class Program_14 {
	public static void main(String args[]) {
		int arr = args.length;
		int max = 0;
		int arr[][] = new int[4][4];
		if (arr < 9)
			System.out.println("please enter 9 integer values");
		if (arr == 9) {
			int k = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = Integer.parseInt(args[k]);
					k++;
				}
			}
			max = arr[0][0];
			System.out.println("The given array is:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
					if (max < arr[i][j])
						max = arr[i][j];
				}
				System.out.println();
			}
			System.out.print("The biggest number in the given Array is " + max);
		}
	}
}
s