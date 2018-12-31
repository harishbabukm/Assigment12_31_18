package ty2;

import java.util.Scanner;

public class ElectricalBilling {

	public static void main(String[] args) {
		System.out.println("enter the units ");
		Scanner sc = new Scanner(System.in);
		double units = sc.nextDouble();
		System.out.println("enter the arrears if any ");
		Scanner sc1 = new Scanner(System.in);
		double arrears = sc1.nextDouble();
		double cost = 0,tolcost=0;
		double dis=0;
		double fine =0;
		if(arrears>0){
		fine = arrears*0.1;
		}
		if(units<=50){
			cost = 1.20*units;
			tolcost = cost+arrears+fine;
			System.out.println("totle cost is "+ cost);
			
		}
		else if(units>50 && units<=100){
			cost = (50*1.2)+(units-50)*2.40;
			tolcost = cost+arrears+fine;
			System.out.println("totle cost is "+ tolcost);
		}
		else if(units>100 && units<=150){
			cost = (50*1.2)+50*2.40+(units-100)*3.60;
			tolcost = cost+arrears+fine;
			System.out.println("totle cost is "+ tolcost);
		}
		else if(units > 150 && units<=200){
			cost = (50*1.2)+50*2.40+50*3.60+(units-150)*4.80;
			tolcost = cost+arrears+fine;
			System.out.println("totle cost is "+ tolcost);
		}
		else if(units>200){
			cost = (50*1.2)+50*2.40+50*3.60+(units-150)*4.80;
			dis = cost*5/100;
			if(dis>200){
				dis = 200;
			}
			cost= cost-dis;
			tolcost = cost+arrears+fine;
			System.out.println("totle cost is "+ tolcost);
		}
	}

}
