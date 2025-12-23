package string;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterOccurenceInAString {

	public static void main(String[] args) {
		
		String s = "Aditi";
		s = s.replace("\\s", "");
		
		Map<Character, Integer> charCount = new HashMap<>();
		
		for(char ch : s.toCharArray())
		{
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry :charCount.entrySet()) {
			System.out.println(entry.getKey() + "-->" +entry.getValue());
		}
		
	}

}
