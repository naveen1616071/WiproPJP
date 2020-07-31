public class Program_13 {
	public static void main(String args[]) {
		for (int a = 10; a < 99; a++) {
			int i, m = 0, flag = 0;
			m = a / 2;
			if (a == 0 || a == 1)
				flag = 1;
			else {
				for (i = 2; i <= m; i++) {
					if (a % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					System.out.println(a);
			}
		}
	}
}
