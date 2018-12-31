package typattern;

public class J {
	public static void main(String[] args) {
		int l=1;
		for(int i=1;i<=4;i++){
			for(int k = 4-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=l;j++){
				
				System.out.print(i);
			}
			l+=2;
			System.out.println();
		}
	}

}
