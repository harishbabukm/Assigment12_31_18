package ty2;

import java.util.Arrays;

public class StringAndInt {

	public static void main(String[] args) {
		String str = "i am in testing for 3";
		str = str.replaceAll("[^-?0-9]+", " "); 
		System.out.println(Arrays.asList(str.trim().split(" ")));
		
	}

	
}
