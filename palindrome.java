import java.util.*;
class palindrome{
public static void main(String[] arg){

String original = "MOm";
String reverse = "";
for(int i=original.length()-1; i>=0; i--){
	reverse += original.charAt(i);
	System.out.println(reverse);
}

	if(original.equalsIgnoreCase(reverse)){
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not palindrome");

	}

}
}