package ty2;

public class Demo {

	public static void main(String[] args) {
		Apple d = new Apple();
		d.tast();
		d.cost();
		
	}
}	
	
	class Fruits{
		void tast(){
			System.out.println(" it tast good ");
		}
		
	}
	
	class Apple extends Fruits{
		void cost(){
			System.out.println(" apple cost more....");
		}
	}
	class orange extends Fruits{
		void cost(){
			System.out.println(" orange cost less....");
		}
	}
