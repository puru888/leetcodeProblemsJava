package map;

import java.util.HashMap;

public class extractUniqueChar {

	public static void extractUnique(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		String op = "";
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			if(map.get(s.charAt(i)) < 2)
				op += s.charAt(i);
		}
		System.out.println(op);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababacd";
		extractUnique(s);
	}

}
