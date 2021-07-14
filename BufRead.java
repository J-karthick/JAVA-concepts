import java.io.*;
class BufRead{

public static void main(String[] arg) throws Exception{


BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the String");
String s=br.readLine();
	int count=0;

for(int i=0; i<s.length();i++){	
	if(s.equals('p'))
	count++;
}
	System.out.println(count);


}
}
