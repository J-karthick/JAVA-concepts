class Array{
	public static void main(String[] arg){
	//int[] a; //declaration of array
	int[] a=new int[5]; //created array
	a[0]=34;
	a[2]=321;
	a[3]=23;
	a[4]=67;
	
	
	//dynamic initalization of an array
	
	int[] b={1,2,3,4,5,6};
	
	//initalization of array using the loop
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=5*(i+5);
	}
	System.out.println(a);
	System.out.println(a.length);
	 
	
	}
	
	
	
	
}