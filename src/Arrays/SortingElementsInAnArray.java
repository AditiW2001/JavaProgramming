package Arrays;

import java.util.Arrays;

public class SortingElementsInAnArray {

	public static void main(String[] args) {

		int a[] = {100,600,300,200,500,400};

		System.out.println("Before sorting...");

		/*for(int x : a)  // approach 1
		{
			System.out.println(x);	
		}*/

		System.out.println(Arrays.toString(a));  //approach 2

		Arrays.sort(a); //inbuilt method to sort array

		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));
	}

}
