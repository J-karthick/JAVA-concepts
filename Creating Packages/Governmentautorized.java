package Government;

public class Governmentautorized{
	
public void government_details(){


int No_of_COVISHIELD =270;
int No_of_COVAXIN = 130;

int one_dose_completed = 3;
int two_dose_completed= 1;
int total_peeps_atleast_onedose_Government =  one_dose_completed + two_dose_completed ;

String[] A=new String[4];

A[0] = "999999990019";
A[1] = "432543434354";
A[2] = "564653758776";
A[3] = "787687667789";

System.out.println("17MIS0207 - J.KARTHICK \n");
System.out.println("Government Authorized \n");

System.out.println("No_of_COVAXIN available: " + No_of_COVAXIN);
System.out.println("No_of_COVISHIELD  available : " + No_of_COVISHIELD );
System.out.println("No of people completed atleast one dose is : "+total_peeps_atleast_onedose_Government);

System.out.println("Addhar Card Numbers Of people who took atleast 1 dose :");
for(int i=0;i<A.length;i++){
System.out.println("Person "+(i+1)+ "\n"+A[i]);
}
System.out.println();
}

public static void main(String[] arg){
	Governmentautorized gd= new Governmentautorized();
	gd.government_details();
	
}
}






