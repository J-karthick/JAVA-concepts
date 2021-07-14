import java.util.*;
public class Numbers{
	
	Scanner s=new Scanner(System.in);
	double input;
	double Number;
	
	
	System.out.println("Enter the Number to find the Square Root : \n");
	input=s.nextDouble();
	
	Number=Math.sqrt(input);
	
	System.out.println("The square Root of the given Number " +input+ " is "+Number);
	
}

class Sqrt{
	public static void main(String[] arg);
	Numbers n=Numbers();
}