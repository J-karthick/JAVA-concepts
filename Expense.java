//Create a class MonthlyExpenseCalculator, containing the
//main function which will compute monthly expense of a 
//family using array of objects. Create an array of objects by
//obtaining the number of family members from the users
//and their monthly budget. The individual expense from
//each family member must be calculated and finally the
//monthly expense of the family should be calculated and
//displayed. This should also display the percentage of
//budget amount spent on each category. 



import java.util.Scanner; 
class Expense
{
Scanner sc=new Scanner(System.in); 
int No_of_family_member;
int Monthly_Budget;
int a,b,c,d,e;
float percentage1,percentage2,percentage3,percentage4,percentage5;

void display()
{
System.out.println("J.KARTHICK \n");
}

void getdetails()
{
System.out.println("No of family member : "); 
No_of_family_member=sc.nextInt();

System.out.println("Monthly Budget"); 
Monthly_Budget=sc.nextInt();

System.out.println("Expense of Member 1 : "); 
a=sc.nextInt();

System.out.println("Expense of Member 2 :"); 
b=sc.nextInt();

System.out.println("Expense of Member 3 :"); 
c=sc.nextInt(); 

System.out.println("Expense of Member 4 :"); 
d=sc.nextInt(); 

System.out.println("Expense of Member 5 :"); 
e=sc.nextInt(); 

int Monthly_Expense= a+b+c+d+e;

System.out.println("Monthly_Expense is : " +Monthly_Expense); 

percentage1= (a*100)/Monthly_Budget;
System.out.println("The percentage of amount spent by member 1 is : " + percentage1);
percentage2= (b*100)/Monthly_Budget;
System.out.println("The percentage of amount spent by member 2 is : " + percentage2);
percentage3= (c*100)/Monthly_Budget;
System.out.println("The percentage of amount spent by member 3 is : " + percentage3);
percentage4= (d*100)/Monthly_Budget;
System.out.println("The percentage of amount spent by member 4 is : " + percentage4);
percentage5= (e*100)/Monthly_Budget;
System.out.println("The percentage of amount spent by member 5 is : " + percentage5);
}


public static void main(String args[])

{
	Expense e[] =new Expense[1];
	{
		System.out.println("J.KARTHICK \n");
	}
for(int i=0;i<2;i++)
{
e[i]=new Expense();
e[i].getdetails();
}
}}
