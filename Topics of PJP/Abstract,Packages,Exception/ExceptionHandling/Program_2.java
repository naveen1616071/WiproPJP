public class Program_2 {

	public static void main(String[] args) {
		int sum=0;
		double average=0;
		int values[]=new int[args.length];
		try {
		for(int i=0;i<args.length;i++)
		{
			values[i]=Integer.parseInt(args[i]);
			sum+=values[i];
		}
		average=sum/args.length;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+average);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
