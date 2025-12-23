package Arrays;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
     String s[] = {"Durga","Aditi","Sweety","Mummy","Papa"};
     
     System.out.println("Before sorting:" +Arrays.toString(s));
     
     Arrays.sort(s);
     
     System.out.println("After Sorting:" +Arrays.toString(s));

	}

}
