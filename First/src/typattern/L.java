package typattern;

public class L {

	public static void main(String[] args) {
		int lines=4;
		for(int i=1;i<=lines;i++){
			for(int k = 4-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
//				if(j=lines/2)
				System.out.print(i);
			}
//			l+=2;
			System.out.println();
		}
	}

}
