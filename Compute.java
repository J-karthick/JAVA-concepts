class Compute{ 
int x;
int y;
int dispLay(int x,int y){
this.x=x; 
this.y=y; 
return x+y;
}
void display(){
x=y++;
y=++x;
System.out.println("The value of x is:"+x);
System.out.println("The value of x is:"+y);
}
}

class Findout{
public static void main(String[] arg){
Compute c=new Compute();
c.x=2;
c.y=65;
int i=c.display(35,45);
System.out.println("The value of i is:"+i++);
c.display();
Compute cl;
c1=c; 
cl.display();
cl.display(3,5);
c=null;
Compute c2=new Compute();
System.out.println("The value of function is:"+c2.display(3,5));
}
}
