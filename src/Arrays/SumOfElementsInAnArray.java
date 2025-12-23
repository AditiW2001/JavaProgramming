package Arrays;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
		// using classic for loop
		for(int i = 0; i<=a.length-1; i++ )
		{
			sum = sum + a[i];
		}
		
		
		//uisng for each loop
		/*for(int x:a)
		{
			sum = sum + a[x-1];
		}
		*/
		System.out.println(sum);

	}

}
