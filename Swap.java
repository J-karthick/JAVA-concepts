import java.util.Arrays;
public class Swap{
public static void main(String[] arg){
	
	  int originalPosition = 1;
      int newPosition = 14;
      int [] myArray = {1,2,3,4,5,6,7,8,9,10,11,1,213,14,15};
      int temp = myArray[originalPosition];
      myArray[originalPosition] = myArray[newPosition];
      myArray[newPosition] = temp;
      System.out.println(Arrays.toString(myArray));
   }
}
	