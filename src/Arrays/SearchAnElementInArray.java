package Arrays;

public class SearchAnElementInArray {

	public static void main(String[] args) {

		int a[]= {100,200,300,400,500};

		int Element = 600;
		boolean status = false;
		

		for(int i = 0; i<a.length;i++)
		{

			if(a[i]==Element)
			{
				System.out.println("Element is Found:" +a[i]);
				status = true;
				break;
			}	
		}
		
		if(status==false)
		{
		System.out.println("Element Not Found");
		}
	}}




