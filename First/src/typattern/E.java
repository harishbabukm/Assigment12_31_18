package typattern;

public class E {
public static void main(String[] args) {
		int l=1;
		for(int i=1;i<=4;i++){
			for(int k = 5-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				System.out.print(l+++" ");
			}
			System.out.println();
		}
	}

}
