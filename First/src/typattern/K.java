package typattern;

public class K {
	public static void main(String[] args) {
		int l=1;
		for(int i=1;i<4;i++){
			l=1;
			for(int k = 4-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(l++);
			}
			for(int j=i;j>=0;j--){
				System.out.print(l--);
			}
			l+=2;
			System.out.println();
		}
		
		/*int l=1;
		int x=1;
		for(int i=1;i<=4;i++){
			x=1;
			for(int k = 4-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=l;j++){
				
if(j<l/2)
	{System.out.print(i);
	}
else
	{System.out.println(i);
	}
	}
			l+=2;
			System.out.println();
		}*/
	}

}
