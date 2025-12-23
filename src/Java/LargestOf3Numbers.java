package Java;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a = 100, b = 50, c = 300;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest:" +a);
		}
		else if(b>c && b>a)
		{
			System.out.println("b is largest:" +b);
		}
        else 
        {
        	System.out.println("c is largest:" +c);
        }

	}

}
