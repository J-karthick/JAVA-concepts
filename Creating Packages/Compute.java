package COVID_VACCINE;

import Government.Governmentautorized;
import Private.Privateautorized;

class Compute{
	
	void display(){
		
		Governmentautorized g=new Governmentautorized();
		g.government_details();
		
		Privateautorized p=new Privateautorized();
		p.Private_details();

		
		System.out.println(p);

		System.out.println("the total number of vaccinations provided by the government and private sectors is : ");
		
		
	}

public static void main(String[] arg)
{

Compute c=new Compute();
c.display();
}
}