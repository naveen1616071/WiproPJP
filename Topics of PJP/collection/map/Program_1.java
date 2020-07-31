package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program_1 {
	HashMap<String, String> map1 = new HashMap<>();

	public HashMap<String, String> saveNations(String CountryName, String capital) {
		map1.put(CountryName, capital);
		return map1;
	}

	public String getCapital(String CountryName) {

		Set<Map.Entry<String, String>> set = map1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>) it.next();
			if (me.getKey().equals(CountryName)) {
				return me.getValue();
			}
		}
		return "No Country Found";
	}

	public String getCountry(String capitalName) {
		Set<Map.Entry<String, String>> set = map1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>) it.next();
			if (me.getValue().equals(capitalName)) {
				return me.getKey();
			}
		}
		return "No Capital Found";
	}

	public HashMap<String, String> reverse() {
		HashMap<String, String> map2 = new HashMap<>();
		Set<Map.Entry<String, String>> set = map1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>) it.next();
			map2.put(me.getValue(), me.getKey());
		}
		return map2;
	}

	public ArrayList<String> arraylistCountry() {
		ArrayList<String> ar = new ArrayList<>();
		Set<Map.Entry<String, String>> set = map1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>) it.next();
			ar.add(me.getKey());
		}
		return ar;
	}

	public ArrayList<String> arraylistCapital() {
		ArrayList<String> ar = new ArrayList<>();
		Set<Map.Entry<String, String>> set = map1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = (Map.Entry<String, String>) it.next();
			ar.add(me.getValue());
		}
		return ar;
	}
	public static void main(String[] args) {
		Program_1 ref = new Program_1();
		ref.saveNations("India", "delhi");
		ref.saveNations("Japan", "Tokiyo");
		System.out.println(ref.map1);
		System.out.println(ref.getCapital("India"));
		System.out.println(ref.getCountry("Tokiyo"));
		System.out.println(ref.reverse());
		System.out.println(ref.arraylistCountry());
		System.out.println(ref.arraylistCapital());
	}
}
