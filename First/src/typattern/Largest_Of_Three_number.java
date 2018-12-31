package typattern;

import java.util.Scanner;

public class Largest_Of_Three_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the Second number");
		int num2=sc.nextInt();
		System.out.println("enter the Thired number");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println("Largest number is "+num1);
		}else if(num2>num1 && num2>num3){
			System.out.println("Largest number is "+num2);
		}else{
			System.out.println("Largest number is "+num3);
		}

	}

}
