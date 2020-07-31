public class Program_3 {
	public static void main(String[] args) {
		int a = args.length;
		if (a == 0)
			System.out.print("No Values");
		else {
			for (int i = 0; i < a - 1; i++)
				System.out.print(args[i] + ",");
			System.out.print(args[a - 1]);
		}
	}
}
