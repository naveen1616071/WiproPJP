package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Naveen");
		al.add("Narayanan");
		al.add("Solai");
		al.add("Prem");
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
