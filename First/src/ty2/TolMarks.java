package ty2;

public class TolMarks {

	public static void main(String[] args) {
		
		int marks []= {20,30,40,50,60};
		int result = sum(marks);
		System.out.println(result);

	}
	
	static int sum(int... ss){
		int sum = 0;
		for(int i=0;i<=ss.length-1;i++){
			sum+=ss[i];
		}
		
		return sum;
	}

}
