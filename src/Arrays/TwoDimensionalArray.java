package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//declaring an array

		int a[][]= new int[3][2];

		//adding values to array

		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;

		//find length of rows and columns in an array
		System.out.println("Rows:"+a.length);
		System.out.println("Columns:"+a[0].length);

		//Read single value from array
		//	System.out.println(a[0][0]);


		//read value from an array using for loop

		/*for(int r=0;r<a.length;r++)
		{
			for(int c=0; c<a[r].length;c++) 
			{
				System.out.print(a[r][c] +" ");
			}
			System.out.println();
		}*/

		//using for each loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x +" ");
			}
			System.out.println();

		}


	}

}
