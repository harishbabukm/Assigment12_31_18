package ty2;

public class DemoPoly {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.act(1);
		sh.act("hello");
		boolean t = false;
		if( t=true){
			System.out.println("hello");
		}
		int x =10;
		if(x<10);
		System.out.println("ello");
	}
}
	class SuperHero{
		void act(int i){
			System.out.println("he will be normal person");
		}
		
		void act(String str){
			System.out.println("he will be super hero");
		}
		
		
	}
	

