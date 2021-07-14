import java.util.*;
import java.io.*;

class Numconverter {

void range(int a) throws RangeExceedsException{

if(a<1||a>3999){

throw new RangeExceedsException("Given value Exceeds the Range");
}

else{

System.out.print("Entered Number is Valid");
}

}

public static void main(String[] arg){

try{

Numconverter nc= new Numconverter();

Scanner s=new Scanner(System.in);

int x=s.nextInt();


nc.range(x);



}

catch(RangeExceedsException r){
	System.out.println("Caught : "+r);
}

}
}
