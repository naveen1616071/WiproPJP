public class Program_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		System.out.println("enter the num"+num);
		System.out.println("binary value"+Integer.toBinaryString(num));
		System.out.println("octal value"+Integer.toOctalString(num));
		System.out.println("hexadecimal value"+Integer.toHexString(num));
	}
}
