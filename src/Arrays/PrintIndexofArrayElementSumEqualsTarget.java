package Arrays;

public class PrintIndexofArrayElementSumEqualsTarget {

	public static void main(String[] args) {

		int a[] = {6,8,11,6,7,18};
		int Target = 17;
		boolean status = false;

		for(int i = 0; i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==Target)
				{
					status = true;
					System.out.println(i +" "+ j);
				}
				
			}
		}
		
		if(status == false)
		{
			System.out.println("No two array elements found with the given sum");
		}
	}
}




