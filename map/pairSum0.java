package map;

import java.util.HashMap;

public class pairSum0 {

	public static int pairSum(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int finalCount = 0;
		for (int i = 0; i < arr.length; i++) {
//			if(map.containsKey(arr[i]))
//				map.put(arr[i], map.get(arr[i])+1);
//			else
//				map.put(arr[i], 1);
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(-arr[i]) && map.get(arr[i]) != 0) {

				int times;

				if (arr[i] == (-arr[i])) {
					int occurence = map.get(arr[i]);
					times = (occurence * (occurence - 1)) / 2;
					finalCount += times;
					map.put(arr[i], 0);
					continue;
				}

				times = map.get(arr[i]) * map.get(-arr[i]);
				finalCount += times;
				map.put(arr[i], 0);
				map.put(-arr[i], 0);

			}
		}
		return finalCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, -2, 2, 3 };
		pairSum(arr);
	}

}
