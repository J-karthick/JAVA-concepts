import java.util.*;
class PrimeNumber{
	static String str;
public static void main(String[] arg){
	do{
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	
	int temp=0;
	for(int i=2;i<=num-1;i++){
		if(num%i==0){
			temp = temp+1;
		}
	}
	if(temp==0){
		System.out.println("The number is Prime");
	}
	else{
		System.out.println("The number is Not Prime");
	}
	str = s.nextLine();
	}while(!str.equals("stop"));
}

}