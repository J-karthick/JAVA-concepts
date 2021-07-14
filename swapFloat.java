public class swapFloat{
public static void main(String[] arg){
float a=1.5f,b=6.3f;
System.out.println("17MIS0207 - J.KARTHICK");
System.out.println("values at first");
System.out.println("a=:" + a );
System.out.println("b=:" + b );

a=a-b;
b=a+b;
a=b-a;

System.out.println("values after swap");
System.out.println("a=:" + a );
System.out.println("b=:" + b );
}
}