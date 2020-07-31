package list;

import java.util.ArrayList;
import java.util.List;

public class Program_2 {
	public static void main(String[] args) {
		List<Object> al1 = new ArrayList<>();
		al1.add(56);
		al1.add(23.0f);
		al1.add(56.78d);
		al1.add("sab");
		ArrayList<Object> al2 = new ArrayList<>();
		for (int i = 0; i < al1.size(); i++) {
			Object o = al1.get(i);
			if (!(o instanceof String)) {
				al2.add(o);
			}
		}
		System.out.println(al2);
	}
}
