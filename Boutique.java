

import java.util.*;

class Customer{
	String customer_name;
	Scanner s=new Scanner(System.in);

public void feedback()
{
int[] arr=new int[10];
for(int a=0;a<2;a++){
	System.out.println("Customer Name "+(a+1));
	customer_name=s.next();


	System.out.println("Enter mode of purchase : ");
	String mode_of_purchase=s.next();
	
	System.out.println("Enter No_of_times_website_visited : ");
	int no_of_times_website_visited= s.nextInt();
	
	System.out.println("Enter No_frequently_purchased_products : ");
	int No_of_frequently_purchased_products=s.nextInt();
	
	System.out.println("Enter the list of frequently_purchased_products : ");

for(int j=1;j<=No_of_frequently_purchased_products;j++)
{
	System.out.println("Enter product :"+j);
	String s1=s.next();
	System.out.println("Enter quality of product from 1 to 10 stars");
	int quality_of_product= s.nextInt();
}
	
	System.out.println("Enter preferable_Mode_of_payment : ");
	String preferable_Mode_of_payment= s.next();
}
}
}


class Priya extends Customer{
	public void compute(){
	int products_average=1;
	int rating_average=2;
	String the_preferable_mode_of_purchase="online";
	String the_preferable_way_of_payment ="Banking";
	int profit_daily;

		
	}
}
	
class Boutique{
	public static void main(String[] arg){
	
	System.out.println("17MIS0207 - J.KARTHICK");
	Customer c=new Customer();
	c.feedback();
	Priya p=new Priya();
	p.compute();
		
	}

}
