package ty2;

public class Demo2 {
	public static void main(String[] args) {
		person1 p1 = new person1();
		p1.dance();
		p1.dis();
		
		person2 p2 = new person2();
		p2.dance();
		p2.dis();
	}
}
	abstract class Demo1 {
		
		abstract void dance();
		
		void dis(){
			System.out.println("super man ");
		}

	}

	class person1 extends Demo1{
		public void dance(){
			System.out.println("person1 will dance in hiphop style");
		}
	}

	class person2 extends Demo1{
		public void dance(){
			System.out.println("person1 will dance in classical style");
		}
		
	}

