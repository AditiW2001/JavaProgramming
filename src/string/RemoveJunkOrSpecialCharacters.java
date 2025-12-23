package string;

import java.util.Arrays;

public class RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {
		
		String s = "W  el@co,m  e";
		System.out.println(s.replace("@", "").replace(",", "").replace(" ", ""));  //removes white spaces as well.
	

	}

}
