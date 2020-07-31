package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Program_3 {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(2);
		vector.add(6);
		vector.add(4);
		vector.add(1);

		Enumeration<Integer> j = vector.elements();
		System.out.println("Output Performed By Enumeration");
		while (j.hasMoreElements()) {
			System.out.println(j.nextElement());
		}
		Iterator<Integer> i = vector.iterator();
		System.out.println("Output Performed By Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator<Integer> k = vector.listIterator();
		System.out.println("Output Performed By ListIterator");
		while (k.hasNext()) {
			System.out.println(k.next());
		}
	}
}
