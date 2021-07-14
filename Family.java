import java.util.Scanner;
public class Family{
public static void main(String[] arg){
	System.out.println(" 17MIS0207 - J.KARTHICK ");
	System.out.println("Enter the no.of persons in the Family : ");
	Scanner s=new Scanner(System.in);
	int s1;
	s1=s.nextInt();
String[] name=new String[s1];
for(int counter=0;counter<s1;counter++){
	System.out.println("Enter the name of the person "+(counter+1));
	name[counter]=s.next();
}

System.out.println("your Family Members are : ");
for(int counter=0;counter<s1;counter++){
	System.out.println(name[counter]);

}
}
}
