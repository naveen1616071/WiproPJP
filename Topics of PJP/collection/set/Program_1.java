package set;

import java.util.HashSet;
import java.util.Iterator;

public class Program_1 {
	HashSet<String> h=new HashSet<>();
	public void  addCountry(String CountryName)
	{
		h.add(CountryName);

	}
	public String getCountry(String CountryName)
	{
		if(h.contains(CountryName))
		{
			return CountryName;
		}
		return "Country not found";
	}
	public void display()
	{
	Iterator<String> i=h.iterator();
	while(i.hasNext())
	System.out.println(i.next());
	}
	public static void main(String[] args) {
		Program_1 g=new Program_1();
		g.addCountry("India");
		g.addCountry("USA");
		g.addCountry("America");
		g.display();
		
		System.out.println(g.getCountry("India"));
		System.out.println(g.getCountry("America"));
		System.out.println(g.getCountry("usa"));
	}

}
