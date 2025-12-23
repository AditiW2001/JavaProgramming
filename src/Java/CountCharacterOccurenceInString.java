package Java;

public class CountCharacterOccurenceInString {

	public static void main(String[] args) {
		
		String s = "Java Programming Java Oops";
		int count = 0;
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='j'||s.charAt(i)=='J')
			{
				count ++;
				
}
		}
		System.out.println("Number Of Occurrences of j is:" +count);

	}

}
