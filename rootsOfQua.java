public class rootsOfQua{
public static void main(String[] args){
double a=10,b=6.4,c=2,root1,root2;

double determinant = b*b-4*a*c;
System.out.println("17MIS0207 - J.KARTHICK");
System.out.println("The determinant for the given Equation is :" + determinant );

if(determinant == 0){


	root1 = root2 = -b/2*a;
	
	System.out.println("The roots are:" + root1 + " and " + root2);
}

else if(determinant>0){

	root1=(-b + Math.sqrt(determinant))/(2*a);
	root2=(-b + Math.sqrt(determinant))/(2*a);
	System.out.println("The roots are:" + root1 + " and " + root2);
}
else{
	double real = -b/2*a;
	double imaginary = (-b + Math.sqrt(-determinant))/(2*a);
	System.out.println("The real root is:" + real + " and The Imaginary root is " + imaginary);
}
}
}