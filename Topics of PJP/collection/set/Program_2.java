package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Program_2 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		StringBuilder sb1 = new StringBuilder("madhan").reverse();
		t.add(sb1.toString());
		StringBuilder sb = new StringBuilder("sabari").reverse();
		t.add(sb.toString());

		Iterator<String> i = t.iterator();
		while (i.hasNext()) {
			if (i.hasNext()) {
				System.out.println(i.next());
			}
		}
		if (t.contains("nahdam")) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
		// System.out.println(tr);
	}
}
