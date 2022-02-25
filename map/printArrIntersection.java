package map;

import java.util.HashMap;
import java.util.Iterator;

public class printArrIntersection {

	public static void printIntersection(int arr1[], int arr2[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				if (map.get(arr2[i]) > 0) {
					System.out.println(arr2[i]);
					map.put(arr2[i], map.get(arr2[i]) - 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 6, 8, 5, 4, 3 };
		int arr2[] = { 2, 3, 4, 7 };
		printIntersection(arr1, arr2);
	}

}
