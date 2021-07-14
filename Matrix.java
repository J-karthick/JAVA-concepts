import java.util.Scanner;

public class Matrix
{
   public static void main(String args[])
   
   {

   Scanner scan = new Scanner(System.in);
   int c;
   
	do{
   System.out.print("17MIS0207 - J.KARTHICK \n");
   
   System.out.print("Select the Matrix Operation to do: \n 1.Marix Additon \n 2.Matrix Subtraction \n 3.Matrix Multiplication\n");
   
   int Additon =1,Subtraction=2,Multiplication=3;
 
   int Matrix = scan.nextInt();
   
 
   switch(Matrix){
	   
	   case 1:
	   
       int i, j;
       int mat1[][] = new int[3][3];
       int mat2[][] = new int[3][3];
       int mat3[][] = new int[3][3];
    
	   
       System.out.print("Enter Matrix 1 Elements : \n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat1[i][j] = scan.nextInt();
			   
           }
		   System.out.println();
       }
	   
       System.out.print("Enter Matrix 2 Elements : \n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat2[i][j] = scan.nextInt();
           }
		   System.out.println();
       }

	   
       System.out.print("Adding both Matrix to form the Third Matrix...\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               mat3[i][j] = mat1[i][j] + mat2[i][j];
           }
		   System.out.println();
       }
	   
       
	   
       System.out.print("The Sum of the Matrix is :\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               System.out.print(mat3[i][j]+ " ");
           }
		   System.out.println();
           
       }
	   break;
	   
	   //subtraction of the matix
	   
	   case 2:
  
       int i1, j1;
       int mat11[][] = new int[3][3];
       int mat22[][] = new int[3][3];
       int mat33[][] = new int[3][3];
      
	   
       System.out.print("Enter Matrix 1 Elements : \n");
       for(i1=0; i1<3; i1++)
       {
           for(j1=0; j1<3; j1++)
           {
               mat11[i1][j1] = scan.nextInt();
           }
		   System.out.println();
       }
	   
       System.out.print("Enter Matrix 2 Elements : \n");
       for(i1=0; i1<3; i1++)
       {
           for(j1=0; j1<3; j1++)
           {
               mat22[i1][j1] = scan.nextInt();
           }
		   System.out.println();
       }
	   
       System.out.print("Subtracting both Matrix to form the Third Matrix...\n");
       for(i1=0; i1<3; i1++)
       {
           for(j1=0; j1<3; j1++)
           {
               mat33[i1][j1] = mat11[i1][j1] - mat22[i1][j1];
           }
		   System.out.println();
       }
	   
       
	   
       System.out.print("The Subtraction of the given Matrix is :\n");
       for(i1=0; i1<3; i1++)
       {
           for(j1=0; j1<3; j1++)
           {
               System.out.print(mat33[i1][j1]+ " ");
           }
           System.out.println();
       }
	   break;
	   
	    case 3:
  
       int i2, j2;
       int mat111[][] = new int[3][3];
       int mat222[][] = new int[3][3];
       int mat333[][] = new int[3][3];
      
	   
       System.out.print("Enter Matrix 1 Elements : \n");
       for(i2=0; i2<3; i2++)
       {
           for(j2=0; j2<3; j2++)
           {
               mat111[i2][j2] = scan.nextInt();
           }
		   System.out.println();
       }
	   
       System.out.print("Enter Matrix 2 Elements : \n");
       for(i2=0; i2<3; i2++)
       {
           for(j2=0; j2<3; j2++)
           {
               mat222[i2][j2] = scan.nextInt();
           }
		   System.out.println();
       }
	   
       System.out.print("Multiplying both Matrix to form the Third Matrix...\n");
       for(i2=0; i2<3; i2++)
       {
           for(j2=0; j2<3; j2++)
           {
               mat333[i2][j2] = mat111[i2][j2] * mat222[i2][j2];
           }
		   System.out.println();
       }
	   
       
	   
       System.out.print("The Multiplicaton of the given Matrix is :\n");
       for(i2=0; i2<3; i2++)
       {
           for(j2=0; j2<3; j2++)
           {
               System.out.print(mat333[i2][j2]+ " ");
           }
           System.out.println();
       }
	   break;
	   
	   
	  
   }
   System.out.println("If you want to coninue press 1, else press 0 to quit : " );
   c=scan.nextInt();
   }while(c==1);
   }
}
