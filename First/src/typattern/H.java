package typattern;

public class H {
	public static void main(String[] args) {
		int l=1;
		for(int i=4;i>=0;i--){
			for(int k = 4-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(l+++" ");
			}
			System.out.println();
		}
	}

}
