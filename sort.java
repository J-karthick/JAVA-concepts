import java.util.*;

import java.io.*;
class sort{

public static void main(String[] arg){
System.out.print("17MIS0207 - J.KARTHICK \n");  
Scanner fileInput;
ArrayList<Double>ipt1 = new ArrayList<Double>();
File inFile = new File("input.txt");

try {
    fileInput = new Scanner(inFile);
    //Reads file contents
while (fileInput.hasNext()){
    ipt1.add(fileInput.nextDouble()); 
    System.out.print(ipt1.get(ipt1.size()-1)); 
}
fileInput.close();

}   
catch (FileNotFoundException e){
    System.out.println(e);
}



    int i = 0;         
    int sum = 0;  
	
while(fileInput.hasNextLine())         
    {       
        int nextInt = fileInput.nextInt();          
        System.out.println(nextInt);      

		sum = sum + nextInt;		
        
        i++;         
    }   
	
	}
}
