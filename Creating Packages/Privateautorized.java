package Private;

public class Privateautorized{
	
public void Private_details(){


int No_of_COVISHIELD =270;
int No_of_COVAXIN = 130;

int one_dose_completed = 3;
int two_dose_completed= 1;
int total_peeps_atleast_onedose_Private =  one_dose_completed + two_dose_completed ;

String[] A=new String[3];
A[0] = "978957544543";
A[1] = "466475687887";
A[2] = "324667878979";

System.out.println("17MIS0207 - J.KARTHICK \n");
System.out.println("Private Authorized \n");
System.out.println("No_of_COVAXIN available: " + No_of_COVAXIN);
System.out.println("No_of_COVISHIELD  available : " + No_of_COVISHIELD );
System.out.println("No of people completed atleast one dose is : "+total_peeps_atleast_onedose_Private);

for(int i=0;i<A.length;i++){
System.out.println("Person "+(i+1)+ "\n"+A[i]);
}

System.out.println("Addhar Card Numbers Of people who took atleast 1 dose :");
int revenue=total_peeps_atleast_onedose_Private *250;
System.out.println("Revenue Generated by Private Health care is :"+revenue);

}

public static void main(String[] arg){
	Privateautorized pd= new Privateautorized();
	pd.Private_details();

}
}






