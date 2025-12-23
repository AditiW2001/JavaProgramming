package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Str = sc.nextLine();
		
		System.out.println("Enter the String:");
		
		Map<Character,Integer> CharMap = new HashMap<Character,Integer>();
		
		            char[] StrArray = Str.toCharArray();
		            
		            for (char c : StrArray) {
		            	if(CharMap.containsKey(c))
		            	{
		            		CharMap.put(c, CharMap.get(c)+1);
		            	}
		            	else
		            	{
		            		CharMap.put(c, 1);
		            	}
		            }
		            
		            System.out.println(Str + CharMap);
		            
	}

}
