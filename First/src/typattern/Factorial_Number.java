package typattern;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc  =  new Scanner(System.in);
		int num  = sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		
		System.out.println("factorial of "+num+" is "+fact);

	}

}
