import java.util.*;
class Personal_Calender{
	static String c;
	public static void main(String[] arg){
		
	int month,planned_hangouts,planned_events,family_functions,career_goals,parties;
	System.out.println("J.Karthick");
	Scanner s1=new Scanner(System.in);
		
	do{
	System.out.println("Enter the Month 1 to 12");

		month=s1.nextInt();
		
		System.out.println("Enter the No. of planned hangouts :");
		planned_hangouts = s1.nextInt();
		System.out.println("Enter the No. of family functions :");
		family_functions = s1.nextInt();
		System.out.println("Enter the No. of career goals :");
		career_goals = s1.nextInt();
	
		
planned_events=planned_hangouts+family_functions+career_goals;	

if(planned_events>0 && planned_events<6)
System.out.println("A Boring Month \n");

else if(planned_events>10 && planned_events<20)
System.out.println("luxury month and save for this month every year \n");

else
System.out.println("Ignore the activiites or go bankrupt \n");



System.out.println("if you want to enter another month(yes or No) : ");
c=s1.next();
}while(c.equals("yes"));
}
}
