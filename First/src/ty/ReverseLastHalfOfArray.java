package ty;

public class ReverseLastHalfOfArray {

	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6,7,8};
		
		int len = arr.length;
		int hlf = len/2;
		for(int i=0;i<hlf;i++){
			System.out.print(arr[i]+",");
		}
		for(int i=len-1;i>=hlf;i--){
			System.out.print(arr[i]+",");
	}
	}
}
