public class Program_15 {
	public static void main(String args[]) {
		
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			int j = 1;
			while (j < i) {
				System.out.print("* ");
				j++;
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
