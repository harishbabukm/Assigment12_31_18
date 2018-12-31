package ty2;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		
		System.out.println("enter 1 for color");
		
		Scanner sc =new Scanner(System.in);
		String ch  = sc.nextLine().toLowerCase();
		switch(ch){
		case "red"  :
			System.out.println(" stop the vechial ");
			break;
		case "yellow" :
			System.out.println(" you can go ");
			break;
		case "green" :
			System.out.println(" get ready you can move ");
			break;
		default:
			System.out.println(" you enterd wrong color ");	
		}

	}

}
