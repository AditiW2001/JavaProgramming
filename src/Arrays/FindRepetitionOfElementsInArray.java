package Arrays;

public class FindRepetitionOfElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,10,20,10};
		int temp1 =10;;
	    int temp2 =20;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i<a.length;i++)
		{
		if(a[i]==temp1)
		{
		count1 ++;	
		}
		else if(a[i]==temp2)
		{
		count2 ++;	
		}
		} 
		System.out.println("No of repetition of 10:" +" "+count1);
		System.out.println("No of repetition of 20:" +" "+count2);
	}
}
