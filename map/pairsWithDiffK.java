package map;

import java.util.HashMap;

public class pairsWithDiffK {

	public static void diffK(int arr[],int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))
				size++;
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for (int j = 0; j < arr.length; j++) {
			
			if(size == 1) {
				int times = (map.get(arr[j])*(map.get(arr[j])-1))/2;
				int count = 0;
				while(count < times) {
					System.out.println(arr[j]+" "+(arr[j]-k));
					count++;
				}
				map.put(arr[j], 0);
			}
			else if(map.containsKey(arr[j]-k)) {
				System.out.println(arr[j]+" "+(arr[j]-k));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {4,4,4,4};
		int arr[] = {2,-1,3,5,6,0,-1,2,6};
		int k = 3;
		diffK(arr, k);
	}

}
