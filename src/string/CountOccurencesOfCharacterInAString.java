package string;

public class CountOccurencesOfCharacterInAString {

	public static void main(String[] args) {

     String s = "welcome to home";
     char c = 'o';
     int count = 0;
     
     for(int i =0; i<=s.length()-1;i++)
     {
    	 if(s.charAt(i)==c)
    	 {
    		 count ++;
    	 }
     }
     System.out.println("Occurence of o is:"+count + "times");
     
	}

}
