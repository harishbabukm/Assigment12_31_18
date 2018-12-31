package typattern;

import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc  =  new Scanner(System.in);
		int num  = sc.nextInt();
		
		if(num==1 || num==0){
			System.out.println(num+ "not a prime number");
		}
		
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				System.out.println(num+" its not prime number");
				break;
			}
			
			
		}
		System.out.println(num+" it is prime number");
	}

}
