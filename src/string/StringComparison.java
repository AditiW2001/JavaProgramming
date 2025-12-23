package string;

public class StringComparison {

	public static void main(String[] args) {
	
		/*String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		//if string is created using variables then both == and equals will return true.

		String s1 = new String("welcome");
		String s2 = new String("welcome");
		System.out.println(s1==s2);          //false - returns false as it compares the objects
		System.out.println(s1.equals(s2));   //true -  return true as it compare the values of the objects
	}

}
