abstract class Compartment
{
	public abstract String notice();	
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "s1";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "s2";
	}
}
class General extends Compartment
{
	public String notice()
	{
		return "s3";
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "s4";
	}
}

public class Program_1 {

	public static void main(String[] args) {
		FirstClass f=new FirstClass();
		String Compartment[]=new String[10];
		Compartment[0]=f.notice();
		Ladies l=new Ladies();
		Compartment[1]=l.notice();
		General g=new General();
		Compartment[2]=g.notice();
		Luggage lu=new Luggage();
		Compartment[3]=g.notice();
		System.out.println(Compartment[1]);
	}

}