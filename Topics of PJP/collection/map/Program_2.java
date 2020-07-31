package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program_2 {
	TreeMap<String,Long> map=new TreeMap<>();
	public	TreeMap<String,Long> saveName(String Name, Long Number)
	{
		map.put(Name, Number);
		return map;
	}
	public Long getNumber(String Name)
	{

		Set <Map.Entry<String, Long>>set=map.entrySet();
		Iterator <Map.Entry<String, Long>>it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Long> me=(Map.Entry<String, Long>)it.next();
			if(me.getKey().equals(Name))
			{
				return me.getValue();
			}
		}
		return null;
	}
	public String getName(Long Number)
	{
		Set <Map.Entry<String, Long>>set=map.entrySet();
		Iterator <Map.Entry<String, Long>>it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Long> me=(Map.Entry<String, Long>)it.next();
			if(me.getValue().equals(Number))
			{
				return me.getKey();
			}
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		Program_2 ref=new Program_2();
		ref.saveName("Sabari",12345467890L);
		ref.saveName("Naveen", 9874561230L);
		System.out.println(ref.map);
		System.out.println(ref.getNumber("Sabari"));
		System.out.println(ref.getName(9874561230L));
	
	}
}
