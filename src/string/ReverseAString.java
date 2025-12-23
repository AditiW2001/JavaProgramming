package string;

public class ReverseAString {

	public static void main(String[] args) {

		//Approach 1 : Using length() and charAt() methods
		/*String s ="welcome";
		String rev = "";

		for(int i = s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
	}*/


//Approach 2: By converting string - toCharArray()
   /*    String s = "welcome";
       String rev = "";
       char a[]= s.toCharArray();
       
       for(int i=a.length-1;i>=0;i--)
       {
    	   rev = rev+a[i];
       }
       System.out.println(rev);    
}*/   
	
//Approach 3: Using String Buffer and String Builder
		//StringBuffer s = new StringBuffer("welcome");
		//System.out.println(s.reverse());
		
		StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());
}
}

