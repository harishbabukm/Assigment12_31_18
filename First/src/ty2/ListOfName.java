package ty2;

import java.util.ArrayList;
import java.util.List;

public class ListOfName {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("harish");
		al.add("hari");
		al.add("harisbabu");
		al.add("babu");
		al.add("mandya");
		al.add("karnataka");

		int i = count(al);
		System.out.println(i);
	}

	static int count(ArrayList str){
		
		
		return str.size();
	}
}
