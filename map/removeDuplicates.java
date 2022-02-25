package map;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

	public static ArrayList<Integer> removeDuplicate(int arr[]) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (seen.containsKey(arr[i]))
				continue;
			output.add(arr[i]);
			seen.put(arr[i], true);
		}

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,2,3,4,5,3,4,5,6,6};
		ArrayList<Integer> op = removeDuplicate(arr);
		for(int x : op) {
			System.out.print(x+" ");
		}
	}

}
