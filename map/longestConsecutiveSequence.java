package map;

import java.util.HashMap;

public class longestConsecutiveSequence {

	public static void longConsecutiveSeq(int arr[]) {
		
		int start = 0;
		int length = 1;
		int index = 0;
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int curr = 0;
			int temp = 0;
			int count = 0;
			int curr_index = i;
			
			if(map.get(arr[i]))
				curr = arr[i];
			
			temp = curr;
			
			while(map.containsKey(temp) && map.get(temp)) {
				map.put(temp, false);
				temp++;
				count++;
			}
			temp = curr - 1;
			while(map.containsKey(temp) && map.get(temp)) {
				map.put(temp, false);
				temp--;
				count++;
			}
			
			if(count > length) {
				if(temp >= curr)
					start = curr;
				else
					start = temp+1;
				
				length = count;
				index = arr[start];
			}
			
			if(count == length && index > curr_index) {
				if(temp >= curr)
					start = curr;
				else
					start = temp+1;
				
				index = arr[start];
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.println(start+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {9,1,8,6,3,4,2,7,10,15};
		//int arr[] = {2 ,12 ,9 ,16 ,10 ,5 ,3 ,20 ,25 ,11 ,1 ,8 ,6 };
		int arr[] = {3 ,7 ,2 ,1 ,9 ,8 ,1};
		//int arr[] = { 15 ,24 ,23 ,12 ,19 ,11 ,16};
		longConsecutiveSeq(arr);
	}

}
