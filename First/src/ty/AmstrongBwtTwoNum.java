package ty;

public class AmstrongBwtTwoNum {

	public static void main(String[] args) {
		
		int num1 = 620 , num2 = 670;
		for (int i = num1; i<=num2; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(""+i+" is an Armstrong number.");
	         }else{
	        	 System.out.println(""+i+" is not an Armstrong number.");
	         }
	      }

	}
	
}
