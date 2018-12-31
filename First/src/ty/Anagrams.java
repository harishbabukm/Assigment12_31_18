package ty;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "peek";
		String str2 = "keep";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if (areAnagram(ch1, ch2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
	
		 static boolean areAnagram(char[] str1, char[] str2) 
		    { 
		       
		        int n1 = str1.length; 
		        int n2 = str2.length; 
		  
		       
		        if (n1 != n2) 
		            return false; 
		  
		      
		        Arrays.sort(str1); 
		        Arrays.sort(str2); 
		  
		      
		        for (int i = 0; i < n1; i++) 
		            if (str1[i] != str2[i]) 
		                return false; 
		  
		        return true; 
		    } 

	}


