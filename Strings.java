

//ERROR
/*
class strings{

public static void main(String[] arg){
String str="Hello, I am in Programming class where the string handling functions are been taught, Also some of the points related to interview based questions are discussed.";
	char c[]=str.toCharArray();
	int count=0;
for(int i=0;i<str.length();i++){

	if(c[i]=='a'){
		count++;
		
	}
	System.out.print(c[i]+count);
}
}
}
*/

class Strings{
	public static void main(String[] arg){
		String s="Karthick pant zip is zipped";
		String s1=s.replace("zip","unzip");
		System.out.println(s1);
		
		
	}
}