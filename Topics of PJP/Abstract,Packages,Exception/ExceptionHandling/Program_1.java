import java.util.InputMismatchException;
import java.util.Scanner;
public class Program_1 {

	public static void main(String[] args) {
		System.out.println("Enter no of elements in array");
		int n=new Scanner(System.in).nextInt();
		int elements[]=new int[n];
		System.out.println("enter the elements");
		try {
		for(int i=0;i<n;i++)
		{
			elements[i]=new Scanner(System.in).nextInt();
		}
		
		System.out.println("Enter the index to get the value from the array");
		int index=new Scanner(System.in).nextInt();
		System.out.println("the array element at index:"+index+" = "+elements[index]);
			System.out.println("the array element successfully accessed");
	}
		catch(InputMismatchException e) {
				System.out.println(e);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter the valid index");
			System.out.println(e);
		}
		System.out.println("the program has finished successfully");


	}

}
