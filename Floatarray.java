import java.util.*;
class Floatarray{
	public static void main(String[] arg){
		System.out.println(" 17MIS0207 - J.KARTHICK ");
		System.out.println("Enter the size of the array");
		Scanner s=new Scanner(System.in);
		int n,sum=0;
		n =s.nextInt();
		
		int[] a=new int[n];
		
		System.out.println(" Enter the elements to sum up ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(a); 
		System.out.println(a.length);
        System.out.println(sum); 		
		
	}
}