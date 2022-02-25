package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class maximumFrequencyNumber {

	public static int maxFreqNumber(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		int max = 0, ans = Integer.MIN_VALUE;
		for(int i : arr) {
			if(map.get(i) > max) {
				max = map.get(i);
				ans = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
		System.out.println(maxFreqNumber(arr));
	}

}
