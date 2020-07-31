
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();

if(num>=1&&num<=255) {
	String output = String.format("%8s",Integer.toBinaryString(num)).replace(' ','0');
	System.out.println(output);
}
	}

}