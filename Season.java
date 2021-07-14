import java.util.Scanner;

public class Season{
public static void main(String[] arg){
	
	System.out.println("17MIS0207 J.KARTHICK");
	System.out.println("Enter the Month");
	
Scanner s = new Scanner(System.in);
int s1,season;
s1=s.nextInt();
	
int january=1,december=2,febuary=12,march=3,april=5,may=4,june=7,july=8,august=6,september=10,october=11,november=9;
switch(s1){
	
          case 1: case 2: case 12: System.out.println("winter"); break;

          case 3: case 4: case 5:  System.out.println("Spring"); break;
          
          case 6: case 7: case 8: System.out.println("Summer"); break;

          case 9: case 10: case 11: System.out.println("Autumn"); break;
          default: System.out.println("Error: invalid month.");
	
}




}




}