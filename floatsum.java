import java.util.*;
import java.io.File;
import java.io.IOException;

public class floatsum
{
    public static void main(String[] args)throws IOException
	
    {
		System.out.print("17MIS0207 - J.KARTHICK \n");  
		
        Scanner textfile = new Scanner(new File("input.txt"));

        filereader(textfile);
}   

   static void filereader(Scanner textfile)     
{         
    int i = 0;         
    int sum = 0;          
    while(textfile.hasNextLine())         
    {       
        int nextInt = textfile.nextInt();          
        System.out.println(nextInt);      

		sum = sum + nextInt;		
        
        i++;         
    }     
}

}