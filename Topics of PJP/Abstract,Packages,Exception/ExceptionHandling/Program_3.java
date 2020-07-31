import java.util.*;
class MyException extends Exception
{
	public String toString() {
		return "Other then in the range of 0-100";
	}
//	void testError()throws MyException{
//		MyException obj=new MyException();
//	}
}
public class Program6 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of students");
	int n=s.nextInt();
	String StudentName[]=new String[n];
	int marks[][]=new int[n][3];
	System.out.println("Enter the Students details and marks");
	try {
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the student name");
			StudentName[i]=s.next();
			System.out.println("enter the first subject mark");
			marks[i][0]=Integer.parseInt(s.next());
			System.out.println("enter the second subject mark");
			marks[i][1]=Integer.parseInt(s.next());
			System.out.println("enter the third subject mark");
			marks[i][2]=Integer.parseInt(s.next());
			if(marks[i][0]<0|| marks[i][0]>100 || marks[i][1]<0 || marks[i][1]>100 || marks[i][2]<0|| marks[i][2]>100)
			{
				throw new MyException();
			}	
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	catch(MyException e)
	{
		System.out.println(e);
	}
//	else
//	{
//		try {
//		new MyException().testError();
//		}
//}
	}

}