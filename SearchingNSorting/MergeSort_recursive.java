package SearchingNSorting;

public class MergeSort_recursive {

	public static void mergeSort(int input[],int startIndex,int endIndex)
	{
		
		if(startIndex >= endIndex)
			return;
		
		int mid = (startIndex+endIndex)/2;
		
		mergeSort(input, startIndex, mid);
		mergeSort(input, mid+1, endIndex);
		merge(input, startIndex, endIndex);
		
		
	}
	
	private static void merge(int input[],int startInedx,int endIndex)
	{
		int mid = (startInedx+endIndex)/2;
		
		int ans[] = new int[endIndex-startInedx+1];
		int i = startInedx;
		int j = mid + 1;
		int k = 0;
		
		while(i <=mid && j<=endIndex)
		{
			if(input[i] < input[j])
			{
				ans[k]=input[i];
				i++;
				k++;
			}
			else {
				ans[k] =input[j];
				j++;
				k++;
			}

		}
		 
		while(i<=mid)
		{
			ans[k] = input[i];
			i++;
			k++;
		}
		
		while(j<=endIndex)
		{
			ans[k] = input[j];
			j++;
			k++;
		}
		
		for (int index = 0; index < ans.length; index++) {
			input[startInedx+index] = ans[index];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {5,4,3,2,1,9,8,7,6};
		mergeSort(input, 0, input.length-1);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
}
}
