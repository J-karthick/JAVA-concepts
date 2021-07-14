import java.io.*;
class twc{
public static void main(String[] arg){
	try{
	FileOutputStream f= new FileOutputStream("file.txt");
	
	String k="17MIS0207 - J.KARTHICK";
	byte b[]=k.getBytes();
	f.write(b);
	System.out.println("Written Successful");
	}
	catch(Exception e){
		System.out.println("Excpetion Caughted");
	}
	
	
	
	
	
}
}