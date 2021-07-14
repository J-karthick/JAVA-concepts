import java.util.*;

class TryCatch{

public static void main(String arg[]){

Scanner s=new Scanner(System.in);

int input = s.nextInt();






try{
	
int a=6;

int infinite=a/input;


if(input>0){
System.out.println("A non zero Number");
}
else
System.out.println("Else Execution:" + infinite);
}

catch(ArithmeticException ae){

System.out.println("Divisible by Zero not possible"+ae);

}
}


}

