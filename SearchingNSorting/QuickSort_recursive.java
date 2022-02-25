package SearchingNSorting;

public class QuickSort_recursive {
	
	public static void quickSort(int input[],int si,int ei)
	{
		if(si>= ei)
			return;
		
		int pivot = partition(input, si, ei);
		quickSort(input, si, pivot-1);
		quickSort(input, pivot+1, ei);
		
	}
	
	private static void swap(int input[],int i,int j)
	{
		int temp =input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public static int partition(int input[],int si,int ei)
	{
		int pivot = input[ei];
		
		int i = si-1;
		
		for (int j = si; j <= ei - 1; j++) {
			if(input[j] < pivot)
			{
				i++;
				swap(input, i, j);
			}
		}
		swap(input, i+1, ei);
		
		return i+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {6,2,20,8,15,3,4};
		quickSort(input, 0, input.length-1);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}

}
