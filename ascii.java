import java.util.*;  
class ascii{ 

public static void main(String[] args)  
{  

System.out.print("17MIS0207 - J.KARTHICK \n");  
Scanner sc= new Scanner(System.in);   
System.out.print("Enter a string: ");  
String str= sc.nextLine();        
System.out.print("String :"+str);       

int sum=0;
    for(int i=0; i<str.length(); i++)
    {
      int asciiValue = str.charAt(i);
      sum = sum+ asciiValue;
     
    }
	System.out.println();
    System.out.println("Sum of ASCII of " + str + "is = " + sum);
  


}  
}  