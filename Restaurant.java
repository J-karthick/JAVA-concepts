
import java.util.*;

public class Restaurant{
	
	public static void main(String[] arg){
		
	System.out.println("17MIS0207 - J.KARTHICK");
	
	Scanner s= new Scanner(System.in);
	
	double mealcost;
	double tax;
	double totalcost;
	int stay;
	int food;
	double food_amount;
	double stay_amount;
	
	System.out.println("Enter the No_of_days_for_food : ");
	food=s.nextInt();
	
	System.out.println("Enter the No_of_days_for_stay : ");
	stay=s.nextInt();
	
	System.out.println("Amount spent for food : ");
	food_amount=s.nextDouble();
	
	System.out.println("Amount spent for Stay: ");
	stay_amount=s.nextDouble();
	
	totalcost=food+stay+food_amount+stay_amount;
	System.out.println("cost spent on Restaurant is : "+totalcost);

	
}
}
