public class Program_6 {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[1]);
		if ((args[0].equals("Male")) && ((x > 0) && (x < 59)))
			System.out.print("Percentage of interest is 8.4%");
		else if ((args[0].equals("Male")) && ((x > 58) && (x < 101)))
			System.out.print("Percentage of interest is 10.5%");
		else if ((args[0].equals("Female")) && ((x > 0) && (x < 59)))
			System.out.print("Percentage of interest is 8.2%");
		else if ((args[0].equals("Female")) && ((x > 58) && (x < 101)))
			System.out.print("Percentage of interest is 9.2%");
	}
}
