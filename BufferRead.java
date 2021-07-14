import java.io.*;

class BufferRead{
public static void main(String[] arg) throws IOException{
	

String s;
String[] a=new String[3];

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("17MIS0207 - J.KARTHICK");
do{



for(int i=0;i<a.length;i++){
	
	a[i]=br.readLine();
}


}while(!a.equals("stop"));

}
}