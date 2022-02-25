package Recursion_Assignments;

import java.util.Iterator;

public class ReturnSubsetOfArr {

	public static int[][] subArr(int arr[], int start, int end) {
		if (start >= end) {
			int ans[][] = new int[1][0];
			return ans;
		}

		int smallAns[][] = subArr(arr, start + 1, end);
		int ans[][] = new int[smallAns.length * 2][];

		int k = 0;
		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = new int[smallAns[i].length];
			for (int j = 0; j < smallAns[i].length; j++) {
				ans[i][j] = smallAns[i][j];
			}

			k++;
		}

		for (int i = 0; i < smallAns.length; i++) {
			ans[i + k] = new int[smallAns[i].length + 1];
			ans[k + i][0] = arr[start];
			for (int j = 1; j <= smallAns[i].length; j++) {
				ans[i + k][j] = smallAns[i][j - 1];
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 20, 12 };
		int ans[][] = subArr(arr, 0, arr.length);

		for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
		}
	}

}
