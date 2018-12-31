package typattern;

import java.util.Scanner;

public class Factorial_Using_Recuression {

	public static void main(String[] args) {
	
		System.out.println("enter the number");
		Scanner sc  =  new Scanner(System.in);
		int num  = sc.nextInt();
		int fact1  = fact(num);
		System.out.println(fact1);

	}

	public static int fact(int n){
		int fact =1;
		if(n==1){
			return 1;
		}
		return n* fact(n-1);
	}
}
