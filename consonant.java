
import java.io.*;
class consonant{
public static void main(String[] arg) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input= br.readLine();

      String regex = "([^aeiouAEIOU0-9\\W]+)";
      String result = input.replaceAll(regex, "");
      System.out.println("After Deletion of the Consonant : "+result);
	  

	  
	  
String str = result;
for(int i=0; i<str.length(); i++)
{
  int asciiValue = str.charAt(i);
  System.out.println(str.charAt(i) + "=" + asciiValue);
}


}
}