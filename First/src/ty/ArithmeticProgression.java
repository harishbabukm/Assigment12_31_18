package ty;

public class ArithmeticProgression {

	public static void main(String[] args) {
		int srt = 5;
		int end = 3;
		int dv= 5;
		
		 System.out.println(sumOfAP(srt,end,dv)); 
	}
	
	static float sumOfAP(float a, float d, int n) {
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a;
			a = a + d;
		}
		return sum;
	}

}
