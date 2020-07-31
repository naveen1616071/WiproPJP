import java.util.*;
class InvalidCountryException extends Exception
{
	public String toString()
	{
		return "User Outside India  cannot be registered";
	}
	
}
public class Program_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the user name");
		String UserName=s.nextLine();
		System.out.println("Enter the country");
		String Country=s.next();
		try {
			if(Country.equalsIgnoreCase("India"))
			{
				System.out.println("User registration done successfully");
			}
			else
			{
				throw new InvalidCountryException();
			}
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}

	}

}