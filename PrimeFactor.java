import java.util.*;
class PrimeFactor{
public static void main(String[] arg){
	Scanner s =new Scanner(System.in);
	int num;
	num= s.nextInt();
	for(int i=1; i<=num; i++){
		if((num%i)==0){
			System.out.print(i+" ");
		}
	}
}
}