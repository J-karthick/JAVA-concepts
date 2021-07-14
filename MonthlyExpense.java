//Create a class MonthlyExpenseCalculator, containing the
//main function which will compute monthly expense of a 
//family using array of objects. Create an array of objects by
//obtaining the number of family members from the users
//and their monthly budget. The individual expense from
//each family member must be calculated and finally the
//monthly expense of the family should be calculated and
//displayed. This should also display the percentage of
//budget amount spent on each category. 

class MonthlyExpense
{
    public static void main(String s[])
    {
		System.out.println("17MIS0207 - J.KARTHICK \n");
	    
		Scanner s=new Scanner(System.in)
		System.out.println("No of Family Members : ");
		
		
        a[] = new a[s];
    
        members[0] = new Family();
        members[0].name = "karthick";
        members[0].Monthly_Expense = 3000;
      
    
        members[1] = new Family();
        members[1].name = "jayavel";
        members[1].Monthly_Expense = 40000;
        
    
        members[2] = new Family();
        members[2].name = "viji";
        members[2].Monthly_Expense = 3000;
        
    
        members[3] = new Family();
        members[3].name = "shiro";
        members[3].Monthly_Expense= 100;
        
    
        members[4] = new Family();
        members[4].name = "Thilaga";
        members[4].Monthly_Expense= 3000;
        
		
    
        for(int i = 0; i < members.length; i++)
        {
            System.out.println( members[i].name + " Expense is : " + members[i].Monthly_Expense );
        }
		
		
    }

}

class Family
{
    String name;
    int Monthly_Expense;
	int Total_amount_spent;
	
	
    
    

}