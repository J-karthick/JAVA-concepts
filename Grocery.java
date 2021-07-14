


import java.util.*;

public class Grocery{
	
	public static void main(String[] arg){
		
	System.out.println("17MIS0207 - J.KARTHICK \n");
	
	Scanner s= new Scanner(System.in);
	
	int No_of_times_purchased;
	double Average_expense_on_each_purchase;
	double Amount_spent_on_grocery;
	double totalcost;
	
	
	System.out.println("Enter No_of_times_Grocery_purchased : ");
	No_of_times_purchased=s.nextInt();
	
	System.out.println("Enter Average_expense_on_each_purchase : ");
	Average_expense_on_each_purchase=s.nextInt();
	
	totalcost= Average_expense_on_each_purchase*No_of_times_purchased;
	
	System.out.println("Amount_spent_on_grocery : "+ totalcost);
	Amount_spent_on_grocery=s.nextDouble();
	

	
}
}
