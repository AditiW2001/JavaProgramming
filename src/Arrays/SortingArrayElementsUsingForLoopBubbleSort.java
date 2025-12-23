package Arrays;

import java.util.Arrays;

public class SortingArrayElementsUsingForLoopBubbleSort {

	public static void main(String[] args) {
		
		int a[] = {20,40,50,30,10};
		
		System.out.println("Before Sorting...:" +Arrays.toString(a));
		
		int n = a.length-1;
		
		for(int i = 0; i<n; i++)
		{
			for(int j=0; j<n; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
					
			}
			
		}
		System.out.println("After Sorting:" +Arrays.toString(a));

	}

}
