package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		//String s = new String("Welcome");
		
		System.out.println(s);
		
		//1. length() ---returns length of a string(no.of characters)
		int l = s.length();
		System.out.println(l);
		System.out.println("Aditi".length());
		
		//2.concat() --- used to join strings
		String s1 = "Good";
		String s2 = "Job";
		String s3 = "Aditi";
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2+s3));
		System.out.println(s1.concat("Hi"));
		System.out.println(s1);  //string is immutable
		
	    System.out.println("good"+"job"+"Aditi");
	    
	    //3.trim() ---removes spaces from right and left side of the string
	    
	    String st ="   welcome   ";
	    System.out.println(st);
	    System.out.println("Length before trimming:"+st.length());
	    System.out.println(st.trim());
	    System.out.println("length after trimming:"+st.trim().length());
	    
	    //4.charAt() -- return a character from the string based on the index.
	    String a = "welcome";
	    System.out.println(a.charAt(3));
	    
	    //5.contains()  - checks if the given string is present in main string
	    System.out.println(a.contains("wel"));
	    System.out.println(a.contains("come"));
	    System.out.println(a.contains("WEL"));   
	    System.out.println(a.contains("welme"));
	    
	    //6.equals and equalsIgnoreCase() -- compares strings
	    s1="welcome";
	    s2="welcome";
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.equals("Welcome"));
	    
	    System.out.println(s1.equalsIgnoreCase("WELCOME"));
	    
	    //7.replace() ---replace single or multiple character/s in a string
	    s1 ="welcome, good morning welcome again";
	    System.out.println(s1.replace('o', 'a'));
	    System.out.println(s1.replace("welcome", "Thankyou"));
	    s1="aabbcc";
	    System.out.println(s1.replace('a','x').replace('c','y'));
	    //System.out.println(s1.replace('c','y')); 
	    
	    
	    //8.substring()  ---extracts substring from main string 
	    //starting index =0
	    //ending index = 1
	    s1="welcome";
	    System.out.println(s1.substring(0, 3));
	    System.out.println(s1.substring(3, 7));
	    System.out.println(s1.substring(0, 1));
	    
	    //9.toUpperCase()  -- converts the given string into uppercase 
	    s1= "welcome";
	    System.out.println(s1.toUpperCase());
	    
	    //10.toLowerCase() --converts the given string into lowercase
	    s1="WELCOME";
	    System.out.println(s1.toLowerCase());
	    
	    //11.split() splits the string into multiple parts based on the delimeter
	    s1="abc@gmail.com";
	    String ar[] = s1.split("@");
	    System.out.println(Arrays.toString(ar));
	    System.out.println(ar[0]);
	    System.out.println(ar[1]);
	    
	    //exp1
	    String amt ="$15,20,50";
	    System.out.println(amt.replace("$", "").replace(",", ""));
	    
	    
	    //exp2
	    s = "abc,123@xyz";
	    String arr[]=s.split(",");
	    System.out.println(Arrays.toString(arr));
	    
	    String arr1[]=arr[1].split("@");
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(arr[0].concat(arr1[0]).concat(arr1[1])); 
	    
	   

	}

}
