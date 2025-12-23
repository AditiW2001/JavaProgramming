package string;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {

		//String --immutable - cannot change
		/* String s = "welcome";
          System.out.println(s.concat("to java"));
          System.out.println(s);  //--- did not change the original value of the string thus its called immutable.
	}*/

		//StringBuffer --mutable - can change the original value
		/*StringBuffer s = new StringBuffer("welcome");
		System.out.println(s.append("to java")); 
		System.out.println(s);//it changes the original value of the string.
		 */

		//StringBuilder --mutable - can change the original value
		StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.append("to java")); 
		System.out.println(s);//it changes the original value of the string.
	}
}
