package typattern;

import java.util.Scanner;

public class Range_Of_N1_N2 {

	public static void main(String[] args) {
		int status = 1;
		System.out.println("enter the Statring range");
		Scanner sc  =  new Scanner(System.in);
		int num1  = sc.nextInt();
		System.out.println("enter the ending range");
		int num2  = sc.nextInt();
		if(num1==1 || num1==0 && num2==1 || num2==0){
			System.out.println(num1+ "not a prime number"+num2);
		}
		
		for(int i=num1;i<num2;i++){
			for(int j=2;j<i;j++){
			if(i%j==0){
				status=0;
				break;
			}else{
				status=1;
			}
			
			}
			if(status==1){
				System.out.println(i+" it is prime number");
				}
		}
		
	}

}
