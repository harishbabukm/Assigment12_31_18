package typattern;

public class G {
	public static void main(String[] args) {
		int l=10;
		for(int i=4;i>=0;i--){
			for(int k = 5-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(l--+" ");
			}
			System.out.println();
		}
	}

}
