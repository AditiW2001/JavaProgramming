package Arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		//Declare an array
		
		//Approach 1
		
		/*int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[] = {100,200,300,400,500};
		
		//find the length of an array
		
		System.out.println(a.length);
		
		//read single value from an array
		
		System.out.println(a[3]);
		
		//read all values from an array
		
		//using classic for loop
		
		for (int i=0; i<a.length;i++)
		//for (int i =0; i<=a.length-1; i++)	
		{
		System.out.println(a[i]);
		}
		
		//using enhanced for loop.... for each loop
		
		for(int x:a)
		{
			System.out.println(x);

		}

		
		

	}

}
