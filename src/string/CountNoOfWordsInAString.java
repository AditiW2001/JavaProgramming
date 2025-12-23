package string;

import java.util.Arrays;

public class CountNoOfWordsInAString {

	public static void main(String[] args) {
	
		String s = "Welcome to java";
		
		String[] a = s.trim().split("\\s+");
		
		System.out.println("Words in the String are:"+" "+a.length +" "+Arrays.toString(a));

	}

}
